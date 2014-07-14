/**
 * DarkSoulsCraft
 * 
 * VERSION.java
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

import cpw.mods.fml.common.Loader;

import static com.shooshosha.darksouls.library.Log.*;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 *
 */
public class VersionHelper implements Runnable {
    private static final String AUTHORITY_URI = "https://raw.github.com/ShooShoSha/DarkSoulsCraft/master/version.xml";
    public static final int CHECK_ATTEMPTS = 3;
    public static final long RETRY_DELAY = 10000;

	private static URL remoteAuthorityLocation;
	private static InputStream remoteAuthorityConnection;
	private static Properties remoteAuthorityProperties;
	
	private static VersionHelper validator = new VersionHelper();
	private static String remoteVersionProperty;
	private static String remoteVersionNumber;
	private static String remoteUpdateLocation;
	
	
	public static void runCheck() throws InterruptedException {
		info("Checking version against remote authority at %s", AUTHORITY_URI);
		new Thread(validator).start();
	}
	
	@Override
	public void run() {
		try {
			checkVersion();
			info("Using current version");
		} catch (VersionCheckException e) {
			warning(e.getMessage());
		} catch (InterruptedException e) {
			severe("VERSION checking failed to initialize");
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
			remoteAuthorityLocation = new URL(AUTHORITY_URI);
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
				info("Unable to connect, attempt %d of %d", attemptsMade, Reference.VERSION_CHECK_ATTEMPTS);
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
		} catch (Exception e) {
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