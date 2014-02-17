/**
 * DarkSoulsCraft
 * 
 * ModLogger.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.lib;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public enum Log {
	INSTANCE;
	
	public static void other(Level level, Throwable exception, String formattedMessage, Object... formattables) {
		FMLLog.log(level, exception, formattedMessage, formattables);
	}
	
	public static void info(String formattedMessage, Object... formattables) {
		FMLLog.info(formattedMessage, formattables);
	}
	
	public static void debug(String formattedMessage, Object... formattables) {
		FMLLog.info("[DEBUG] " + formattedMessage, formattables);
	}
	
	public static void warning(String formattedMessage, Object... formattables) {
		FMLLog.warning(formattedMessage, formattables);
	}
	
	public static void severe(String formattedMessage, Object... formattables) {
		FMLLog.severe(formattedMessage, formattables);
	}
}
