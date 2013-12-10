/**
 * DarkSoulsCraft
 * 
 * GeneralConfiguration.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.config;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;
import java.util.logging.Level;

import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.Configuration;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class GeneralConfiguration {
	private static Configuration generalConfiguration;
	
	protected static void init(File configFile) {
		generalConfiguration = new Configuration(configFile);
		
		try {
			generalConfiguration.load();
			
			/* Version check */
			ConfigurationSettings.VERSION_RESULT = generalConfiguration.get(CATEGORY_GENERAL, ConfigurationSettings.VERSION_RESULT_NAME, ConfigurationSettings.VERSION_RESULT_DEFAULT).getBoolean(ConfigurationSettings.VERSION_RESULT_DEFAULT);
			ConfigurationSettings.VERSION_DISCOVERED = generalConfiguration.get(CATEGORY_GENERAL, ConfigurationSettings.VERSION_DISCOVERED_NAME, ConfigurationSettings.VERSION_DISCOVERED_DEFAULT).getString();
			ConfigurationSettings.VERSION_TYPE = generalConfiguration.get(CATEGORY_GENERAL, ConfigurationSettings.VERSION_TYPE_NAME, ConfigurationSettings.VERSION_TYPE_DEFAULT).getString();
			
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, StatCollector.translateToLocalFormatted(Messages.CONFIG_GENERAL, Reference.MOD_NAME));
		} finally {
			generalConfiguration.save();
		}
	}
	
	public static void set(String categoryName, String propertyName, String newValue) {
		generalConfiguration.load();
		if(generalConfiguration.getCategoryNames().contains(categoryName)) {
			if(generalConfiguration.getCategory(categoryName).containsKey(propertyName)) {
				generalConfiguration.getCategory(categoryName).get(propertyName).set(newValue);
			}
		}
	}
}
