/**
 * DarkSoulsCraft
 * 
 * ModLogger.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.base.Optional;
import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.common.FMLLog;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public enum LogHelper {
	INSTANCE;
	
	private Optional<Logger> logger = Optional.absent();
	
	private Logger getLogger() {
		if(!logger.isPresent()) {
			initializeLogger();
		}
		return logger.get();
	}
	
	private void initializeLogger() {
		if(logger.isPresent()) {
			return;
		}
		logger = Optional.of(Logger.getLogger(Reference.MOD_ID));
		logger.get().setParent(FMLLog.getLogger());
	}
	
	private void log(Level level, String formattedMessage, Object... formattables) {
		getLogger().log(level, String.format(formattedMessage, formattables));
	}
	
	public static void log(Level level, Throwable exception, String formattedMessage, Object... formattables) {
		INSTANCE.getLogger().log(level, String.format(formattedMessage, formattables), exception);
	}
	
	public static void info(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.INFO, formattedMessage, formattables);
	}
	
	public static void debug(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.INFO, "[DEBUG]" + formattedMessage, formattables);
	}
	
	public static void warning(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.WARNING, formattedMessage, formattables);
	}
	
	public static void severe(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.SEVERE, formattedMessage, formattables);
	}
	
	public static void fine(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.FINE, formattedMessage, formattables);
	}
	
	public static void finer(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.FINER, formattedMessage, formattables);
	}
	
	public static void finest(String formattedMessage, Object... formattables) {
		INSTANCE.log(Level.FINEST, formattedMessage, formattables);
	}
}
