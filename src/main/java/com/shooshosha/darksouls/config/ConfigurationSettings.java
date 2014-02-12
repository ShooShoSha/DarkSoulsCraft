/**
 * DarkSoulsCraft
 * 
 * ConfigurationSettings.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.config;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public class ConfigurationSettings {
	//Version check related settings
	public static boolean VERSION_RESULT;
	public static final String VERSION_RESULT_NAME = "version_check.results";
	public static final boolean VERSION_RESULT_DEFAULT = true;
	
	public static String VERSION_DISCOVERED;
	public static final String VERSION_DISCOVERED_NAME = "version_check.discovered";
	public static final String VERSION_DISCOVERED_DEFAULT = "";
	
	public static String VERSION_TYPE;
	public static final String VERSION_TYPE_NAME = "version_check.type";
	public static final String VERSION_TYPE_DEFAULT = "";
}
