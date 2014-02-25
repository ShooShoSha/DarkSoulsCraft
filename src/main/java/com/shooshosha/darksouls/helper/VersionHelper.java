/**
 * DarkSoulsCraft
 * 
 * Version.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import com.shooshosha.darksouls.error.VersionCheckException;
import com.shooshosha.darksouls.library.Log;
import com.shooshosha.darksouls.library.Messages;
import com.shooshosha.darksouls.library.Reference;

import cpw.mods.fml.common.Loader;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 *
 */
public class VersionHelper implements Runnable {
	private static URL remoteAuthorityLocation;
	private static InputStream remoteAuthorityConnection;
	private static Properties remoteAuthorityProperties;
	
	private static VersionHelper validator = new VersionHelper();
	private static String remoteVersionProperty;
	private static String remoteVersionNumber;
	private static String remoteUpdateLocation;
	
	
	public static void runCheck() throws InterruptedException {
		Log.info("Checking version against remote authority at %s", Reference.VERSION_AUTHORITY_LOCATION);
		new Thread(validator).start();
	}
	
	@Override
	public void run() {
		try {
			checkVersion();
			Log.info("Using current version");
		} catch (VersionCheckException e) {
			Log.warning(e.getMessage());
		} catch (InterruptedException e) {
			Log.severe("Version checking failed to initialize");
		}
	}
	
	private static void checkVersion() throws VersionCheckException, InterruptedException {
		connectToAuthority();
		extractVersionProperty();
		compareVersions();
	}
	
	private static void connectToAuthority() throws InterruptedException {
		getRemoteAuthorityLocation();
	}
	
	private static void getRemoteAuthorityLocation() throws InterruptedException {
		try {
			remoteAuthorityLocation = new URL(Reference.VERSION_AUTHORITY_LOCATION);
		} catch (MalformedURLException e) {
			throw new VersionCheckException("Invalid authority URI", e);
		}
		getRemoteAuthorityConnection();
	}
	
	private static void getRemoteAuthorityConnection() throws InterruptedException {
		int attemptsMade = 0;
		while (remoteAuthorityConnection == null && ++attemptsMade < Reference.VERSION_CHECK_ATTEMPTS) {
			try  {
				remoteAuthorityConnection = remoteAuthorityLocation.openStream();
				getRemoteAuthorityProperties();
			} catch (IOException e) {
				Log.info("Unable to connect, attempt %d of %d", attemptsMade, Reference.VERSION_CHECK_ATTEMPTS);
				Thread.sleep(Reference.VERSION_RETRY);
			}
		}
		if(remoteAuthorityConnection.equals(null)) {
			throw new VersionCheckException("Unable to connect to remote authority");
		}
	}
	
	private static void getRemoteAuthorityProperties() {
		try {
			remoteAuthorityProperties = new Properties();
			remoteAuthorityProperties.loadFromXML(remoteAuthorityConnection);
			remoteAuthorityConnection.close();
		} catch (IOException e) {
			throw new VersionCheckException(Messages.VERSION_REMOTE_FILE_INVALID, e);
		}
	}
	
	private static void extractVersionProperty() {
		try {
			remoteVersionProperty = remoteAuthorityProperties.getProperty(Loader.instance().getMCVersionString());
			String[] remoteVersionPropertyTokens = remoteVersionProperty.split("\\|");
			remoteVersionNumber = remoteVersionPropertyTokens[0];
			remoteUpdateLocation = remoteVersionPropertyTokens[1];
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			throw new VersionCheckException("Unable to find a version at remote authority");
		}
	}
	
	private static void compareVersions() {
		if (!getVersionForComparison().equalsIgnoreCase(remoteVersionNumber)) {
			throw new VersionCheckException(String.format("A new version Exists.class Get it here: %s", remoteUpdateLocation));
		}
	}
	
	private static String getVersionForComparison() {
		return Reference.MOD_VERSION.split(":")[0];
	}
}