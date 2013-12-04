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
	public static final String MOD_ID = "darksoulscraft";
	public static final String MOD_NAME = "Dark Souls Craft";
	public static final String MOD_DEPENDENCIES = "required_after:Forge@[9.11.1.953,)";
	public static final String MOD_VERSION = "@VERSION@:@BUILD@";
	
	//Version control constants
	public static final int VERSION_CHECK_ATTEMPTS = 3;
	public static final long VERSION_RETRY = 10000;
	public static final String VERSION_REMOTE_FILE = "https://raw.github.com/ShooShoSha/DarkSoulsCraft/master/version.xml";
	
	//Proxy class constants
	public static final String PROXY_CLIENT	 = "com.shooshosha.darksouls.core.proxy.ClientProxy";
	public static final String PROXY_SERVER  = "com.shooshosha.darksouls.core.proxy.ServerProxy";
	
	//Jar signature constants
	public static final String FINGERPRINT = "@FINGERPRINT@";
}
