/**
 * DarkSoulsCraft
 * 
 * ItemConfiguration.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.shooshosha.darksouls.language.Localize;
import com.shooshosha.darksouls.lib.Log;
import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;

/**
 * @author shooshosha
 * @date Dec 10, 2013
 *
 */
public class ItemConfiguration {
	private static Configuration itemConfiguration;
	
	public static void initialize(File itemConfigurations) {
		itemConfiguration = new Configuration(itemConfigurations);
		
		
		try {
			itemConfiguration.load();
			
			readItemConfigurations();
			
		} catch (Exception e) {
			Log.severe(Localize.message(Messages.CONFIG_ITEM, Reference.MOD_ID), e);
		} finally {
			itemConfiguration.save();
		}
	}
	
	private static void readItemConfigurations() {
		//TODO read item configuration file
	}
}
