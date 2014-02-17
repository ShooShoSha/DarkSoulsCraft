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
		FMLLog.log(Reference.MOD_ID, level, exception, formattedMessage, formattables);
	}
	
	private static void log(Level level, String formattedMessage, Object... formattables) {
		FMLLog.log(Reference.MOD_ID, level, formattedMessage, formattables);
	}
	
	public static void info(String formattedMessage, Object... formattables) {
		log(Level.INFO, formattedMessage, formattables);
	}
	
	public static void debug(String formattedMessage, Object... formattables) {
		log(Level.INFO, "[DEBUG] " + formattedMessage, formattables);
	}
	
	public static void warning(String formattedMessage, Object... formattables) {
		log(Level.WARN, formattedMessage, formattables);
	}
	
	public static void severe(String formattedMessage, Object... formattables) {
		log(Level.FATAL, formattedMessage, formattables);
	}
}
