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
import java.util.logging.Level;

import com.shooshosha.darksouls.lib.ItemIds;
import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.Configuration;

/**
 * @author shooshosha
 * @date Dec 10, 2013
 *
 */
public class ItemConfiguration {
	private static Configuration itemConfiguration;
	
	public static void init(File configPath) {
		itemConfiguration = new Configuration(configPath);
		
		
		try {
			itemConfiguration.load();
			
			/* Item configurations */
			ItemIds.HOMEWARD_BONE = itemConfiguration.getItem(ItemIds.HOMEWARD_BONE_NAME, ItemIds.HOMEWARD_BONE_DEFAULT).getInt(ItemIds.HOMEWARD_BONE_DEFAULT);
			
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, StatCollector.translateToLocalFormatted(Messages.CONFIG_ITEM, Reference.MOD_NAME));
		} finally {
			itemConfiguration.save();
		}
	}
}
