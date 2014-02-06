/**
 * DarkSoulsCraft
 * 
 * Version.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.core.helper;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import scala.collection.script.Message;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.Configuration;

import com.shooshosha.darksouls.config.ConfigurationSettings;
import com.shooshosha.darksouls.config.GeneralConfiguration;
import com.shooshosha.darksouls.error.VersionCheckException;
import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;
import com.shooshosha.darksouls.localize.Localize;

import cpw.mods.fml.common.Loader;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 *
 */
public class Version implements Runnable {
	public static Properties remoteVersionProperties = new Properties();
	
	private static Version validator = new Version();
	private static InputStream remoteVersionRepository;
	private static String remoteVersion;
	private static String remoteUpdateLocation;
	
	
	public static void runCheck() throws InterruptedException {
		Log.info(Localize.message(Messages.VERSION_INIT, Reference.VERSION_REMOTE_FILE));
		new Thread(validator).start();
	}
	
	//@Override
	public void _run() {
		try {
			attemptCheck(Reference.VERSION_CHECK_ATTEMPTS);
			retrieveXMLFileFromStream();
			extractPropertiesFromXML();
		} catch (VersionCheckException e) {
			
		}
	}

	private void attemptCheck(int versionCheckAttempts) throws VersionCheckException {
		int attemptsMade = 0;
		while (++attemptsMade < versionCheckAttempts) {
			connectToRemoteFile(Reference.VERSION_REMOTE_FILE);
		}
	}

	private static void connectToRemoteFile(String remoteFileAddress) {
		URL remoteFileVersion;
		try {
			remoteFileVersion = new URL(remoteFileAddress);
			remoteVersionRepository = remoteFileVersion.openStream();
		} catch (IOException exception) {
			Thread.sleep(Reference.VERSION_RETRY);
			throw new VersionCheckException(Localize.message(Messages.VERSION_ERROR_CONNECT), exception);
		}
		
	}
	
	private static void retrieveXMLFileFromStream() {
		try {
			remoteVersionProperties.loadFromXML(remoteVersionRepository);
		} catch (InvalidPropertiesFormatException e) {
			throw new VersionCheckException();
		} catch (IOException e) {
			throw new VersionCheckException();
		}
	}
	
	private void extractPropertiesFromXML() {
		String relevantVersionPropertyElement = 
				remoteVersionProperties.getProperty(Loader.instance().getMCVersionString());
		try {
			String[] versionPropertyElementTokens = relevantVersionPropertyElement.split("\\|");
			remoteVersion = versionPropertyElementTokens[0];
			remoteUpdateLocation = versionPropertyElementTokens[1];
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			throw new VersionCheckException(Localize.message(Messages.VERSION_ERROR_MC, Reference.MOD_NAME, 
					Loader.instance().getMCVersionString()), e);
		}
	}
	
	// TODO Replace with exception handling.
	//Results of remote version number check
	public static final byte UNINITIALIZED = 0;
	public static final byte CURRENT = 1;
	public static final byte OUTDATED = 2;
	public static final byte ERROR_CONNECT = 3;
	public static final byte ERROR_ATTEMPT = 4;
	public static final byte ERROR_MC = 5;
	
	//Variables to hold results of remote version check, set to uninitialized
	public static byte result = UNINITIALIZED;
	
	public static void checkVersion() {
		InputStream remoteVersionRepoStream = null;
		result = UNINITIALIZED;
		
		try {
			URL remoteVersionURL = new URL(Reference.VERSION_REMOTE_FILE);
			remoteVersionRepoStream = remoteVersionURL.openStream();
			remoteVersionProperties.loadFromXML(remoteVersionRepoStream);
			
			String remoteVersionProperty = remoteVersionProperties.getProperty(Loader.instance().getMCVersionString());
			
			if (remoteVersionProperty != null) {
                String[] remoteVersionTokens = remoteVersionProperty.split("\\|");

                if (remoteVersionTokens.length >= 2) {
                    remoteVersion = remoteVersionTokens[0];
                    remoteUpdateLocation = remoteVersionTokens[1];
                }
                else {
                    result = ERROR_CONNECT;
                }

                if (remoteVersion != null) {
                    if (!ConfigurationSettings.VERSION_DISCOVERED.equalsIgnoreCase(remoteVersion)) {
                        GeneralConfiguration.set(Configuration.CATEGORY_GENERAL, ConfigurationSettings.VERSION_DISCOVERED_NAME, remoteVersion);
                    }

                    if (remoteVersion.equalsIgnoreCase(getVersionForCheck())) {
                        result = CURRENT;
                    }
                    else {
                        result = OUTDATED;
                    }
                }

            }
		} catch (Exception e) {
			
		}
	}
	
	/**
	 * @return
	 */
	private static String getVersionForCheck() {
		String[] versionTokens = Reference.MOD_VERSION.split(":");
		if(versionTokens.length > 0) {
			return versionTokens[0];
		} else {
			return Reference.MOD_VERSION;
		}
	}

	public static void logResult() {
		if(CURRENT == result || result == OUTDATED) {
			Log.info(getResultMessage());
		} else {
			Log.warning(getResultMessage());
		}
	}
	
	public static String getResultMessage() {
		switch (result) {
		case UNINITIALIZED:
			return StatCollector.translateToLocal(Messages.VERSION_UNINIT);
		case CURRENT:
			return StatCollector.translateToLocalFormatted(Messages.VERSION_CURRENT, Reference.MOD_ID, Loader.instance().getMCVersionString());
		case OUTDATED:
			if(null != remoteVersion && remoteUpdateLocation != null) {
				return StatCollector.translateToLocalFormatted(Messages.VERSION_OUTDATED, remoteVersion, Loader.instance().getMCVersionString(), remoteUpdateLocation);
			}
		case ERROR_CONNECT:
			return StatCollector.translateToLocal(Messages.VERSION_ERROR_CONNECT);
		case ERROR_ATTEMPT:
			return StatCollector.translateToLocal(Messages.VERSION_ERROR_ATTEMPT);
		case ERROR_MC:
			return StatCollector.translateToLocalFormatted(Messages.VERSION_ERROR_MC, Reference.MOD_NAME, Loader.instance().getMCVersionString());
		default:
			result = ERROR_UNKNOWN;
			return StatCollector.translateToLocal(Messages.VERSION_ERROR_UNKNOWN);
		}
	}
	
	@Override
	public void run() {
		int count = 0;
		
		try {
			while (count++ < Reference.VERSION_CHECK_ATTEMPTS && (UNINITIALIZED == result || result == ERROR_CONNECT)) {
				checkVersion();
				logResult();
				if (UNINITIALIZED == result || result == ERROR_CONNECT) {
					Thread.sleep(Reference.VERSION_RETRY);
				}
			}
			
			if (result == ERROR_CONNECT) {
				result = ERROR_ATTEMPT;
				logResult();
			}
		} catch (InterruptedException e) {
			
		}
	}
}
