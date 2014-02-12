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

import com.shooshosha.darksouls.helper.LogHelper;
import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;
import com.shooshosha.darksouls.localize.Localize;

import net.minecraftforge.common.Configuration;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class GeneralConfiguration {
	private static Configuration generalConfiguration;
	
	public static void initialize(File generalConfigurations) {
		generalConfiguration = new Configuration(generalConfigurations);
		
		try {
			generalConfiguration.load();
			
			getVersionInformation();
			
		} catch (Exception e) {
			LogHelper.severe(Localize.message(Messages.CONFIG_ITEM, Reference.MOD_ID), e);
		} finally {
			generalConfiguration.save();
		}
	}
	
	private static void getVersionInformation() {
		getVersionDisplayResult();
		getLastDiscoveredVersion();
		getTypeOfLastDiscoveredVersion();
	}
	
	private static void getVersionDisplayResult() {
		ConfigurationSettings.VERSION_RESULT = generalConfiguration.get(CATEGORY_GENERAL, 
				ConfigurationSettings.VERSION_RESULT_NAME, 
				ConfigurationSettings.VERSION_RESULT_DEFAULT).getBoolean(ConfigurationSettings.VERSION_RESULT_DEFAULT);
	}
	
	private static void getLastDiscoveredVersion() {
		ConfigurationSettings.VERSION_DISCOVERED = generalConfiguration.get(CATEGORY_GENERAL, 
				ConfigurationSettings.VERSION_DISCOVERED_NAME, 
				ConfigurationSettings.VERSION_DISCOVERED_DEFAULT).getString();
	}
	
	private static void getTypeOfLastDiscoveredVersion() {
		ConfigurationSettings.VERSION_TYPE = generalConfiguration.get(CATEGORY_GENERAL, 
				ConfigurationSettings.VERSION_TYPE_NAME, 
				ConfigurationSettings.VERSION_TYPE_DEFAULT).getString();
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