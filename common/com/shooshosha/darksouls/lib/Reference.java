/**
 * DarkSoulsCraft
 * 
 * Reference.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.lib;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 *
 */
public class Reference {
	//Mod specific constants
	public static final String MOD_ID = "DSC";
	public static final String MOD_NAME = "Dark Souls Craft";
	public static final String MOD_DEPENDENCIES = ""; //This needs to be fixed
	public static final String MOD_VERSION = "@VERSION@:@BUILD@";
	
	//Version control constants
	public static final int VERSION_CHECK_ATTEMPTS = 3;
	public static final long VERSION_RETRY = 10000; //Time in milliseconds before attempting a retry
	public static final String VERSION_REMOTE_FILE = "https://raw.github.com/ShooShoSha/DarkSoulsCraft/master/version.xml";
	
	//Proxy class constants
	public static final String PROXY_CLIENT	 = "com.shooshosha.darksouls.core.proxy.ClientProxy";
	public static final String PROXY_SERVER  = "com.shooshosha.darksouls.core.proxy.ServerProxy";
	
	//Jar signature constants
	public static final String FINGERPRINT = "@FINGERPRINT@";
	
	//Object id offset constant
	public static final int ID_RANGE_CORRECTION = 256;
	
	//Localizations prefix
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
}
