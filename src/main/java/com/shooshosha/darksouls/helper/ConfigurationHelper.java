/**
 * DarkSoulsCraft
 * 
 * ConfigurationHandler.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import java.io.File;

import com.shooshosha.darksouls.config.GeneralConfiguration;
import com.shooshosha.darksouls.config.ItemConfiguration;
import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author shooshosha
 * @date Dec 10, 2013
 *
 */
public class ConfigurationHelper {
	private static File allModsConfigurationsDirectory;
	private static String absoultePathOfThisModsConfigurationDirectory;
	private static File generalModConfigurations;
	private static File itemModConfigurations;
	
	public static void initializeFiles(FMLPreInitializationEvent preLoadingEvent) {
		getModConfigurationsPaths(preLoadingEvent);
		GeneralConfiguration.initialize(generalModConfigurations);
		ItemConfiguration.initialize(itemModConfigurations);
	}
	
	private static void getModConfigurationsPaths(FMLPreInitializationEvent preLoadingEvent) {
		allModsConfigurationsDirectory = preLoadingEvent.getModConfigurationDirectory();
		getThisModsConfigurationDirectory();
		getThisModsConfigurationFiles();
	}
	
	private static void getThisModsConfigurationDirectory() {
		absoultePathOfThisModsConfigurationDirectory = allModsConfigurationsDirectory.getAbsolutePath() + File.separator;
	}
	
	private static void getThisModsConfigurationFiles() {
		getGeneralConfigurationFile();
		getItemConfigurationFile();
	}
	
	private static void getGeneralConfigurationFile() {
		generalModConfigurations = new File(prefixConfigurationFileWithModId("general.properties"));
	}
	
	private static void getItemConfigurationFile() {
		itemModConfigurations = new File(prefixConfigurationFileWithModId("item.properties"));
	}
	
	private static String prefixConfigurationFileWithModId(String configurationFileName) {
		return absoultePathOfThisModsConfigurationDirectory + Reference.MOD_ID + configurationFileName;
	}
}
