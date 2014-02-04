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

import com.shooshosha.darksouls.core.helper.Log;
import com.shooshosha.darksouls.lib.ItemIds;
import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;
import com.shooshosha.darksouls.localize.Localize;

import net.minecraftforge.common.Configuration;

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
		ItemIds.HOMEWARD_BONE = itemConfiguration.getItem(ItemIds.HOMEWARD_BONE_NAME, 
				ItemIds.HOMEWARD_BONE_DEFAULT).getInt(ItemIds.HOMEWARD_BONE_DEFAULT);
	}
}
