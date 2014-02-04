/**
 * DarkSoulsCraft
 * 
 * PreInitializer.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.core.helper;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author shooshosha
 * @date Feb 4, 2014
 *
 */
public class PreInitializer {
	public static void handle(FMLPreInitializationEvent preInitializeEvent) {
		Log.initialize();
		
		ConfigurationHelper.initializeFiles(preInitializeEvent);
		
		VersionHelper.execute();
		
		ItemsHelper.init();
	}
}
