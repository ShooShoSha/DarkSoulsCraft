/**
 * DarkSoulsCraft
 * 
 * PreInitializer.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.event;

import com.shooshosha.darksouls.block.DSCBlocks;
import com.shooshosha.darksouls.item.DSCItems;

import com.shooshosha.darksouls.helper.ConfigurationHelper;
import com.shooshosha.darksouls.helper.VersionHelper;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author shooshosha
 * @date Feb 4, 2014
 *
 */
public final class PreInitializer {
	public static void handle(FMLPreInitializationEvent preInitializeEvent) {
		ConfigurationHelper.initializeFiles(preInitializeEvent);
		
		try {
			VersionHelper.runCheck();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		DSCItems.initialize();
		
		DSCBlocks.initialize();
	}		
}
