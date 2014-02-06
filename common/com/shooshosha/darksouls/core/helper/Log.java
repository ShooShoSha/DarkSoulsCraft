/**
 * DarkSoulsCraft
 * 
 * ModLogger.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.core.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.common.FMLLog;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public class Log {
	private static Logger dsLogger = Logger.getLogger(Reference.MOD_ID);
	
	public static void initialize() {
		dsLogger.setParent(FMLLog.getLogger());
	}
	
	private static void log(Level logLevel, String logMessage) {
		log(logLevel, logMessage, null);
	}
	
	private static void log(Level logLevel, String logMessage, Throwable logException) {
		dsLogger.log(logLevel, logMessage, logException);
	}
	
	public static void severe(Object loggable) {
		log(Level.SEVERE, loggable.toString());
	}
	
	public static void severe(String message, Throwable exception) {
		log(Level.SEVERE, message, exception);
	}

    public static void debug(Object object) {

        log(Level.WARNING, "[DEBUG] " + object.toString());
    }
    
    public static void debug(String message, Throwable exception) {
    	log(Level.WARNING, "[DEBUG]" + message, exception);
    }

    public static void warning(Object object) {

        log(Level.WARNING, object.toString());
    }
    
    public static void warning(String message, Throwable exception) {
    	log(Level.WARNING, message, exception);
    }

    public static void info(Object object) {
        log(Level.INFO, object.toString());
    }
    
    public static void info(String message, Throwable exception) {
    	log(Level.INFO, message, exception);
    }

    public static void config(Object object) {
        log(Level.CONFIG, object.toString());
    }
    
    public static void config(String message, Throwable exception) {
    	log(Level.CONFIG, message, exception);
    }
    
    public static void fine(Object object) {
        log(Level.FINE, object.toString());
    }
    
    public static void fine(String message, Throwable exception) {
    	log(Level.FINE, message, exception);
    }

    public static void finer(Object object) {
        log(Level.FINER, object.toString());
    }
    
    public static void finer(String message, Throwable exception) {
    	log(Level.FINER, message, exception);
    }

    public static void finest(Object object) {
        log(Level.FINEST, object.toString());
    }
    
    public static void finest(String message, Throwable exception) {
    	log(Level.FINEST, message, exception);
    }
}
