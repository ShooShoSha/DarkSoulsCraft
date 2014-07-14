/*
 * Copyright 2014. Kevin O'Brien (shooshosha@gmail.com) License: LGPLv3 or later
 *
 * This file is part of DarkSoulsCraft.
 *
 * DarkSoulsCraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * DarkSoulsCraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DarkSoulsCraft.  If not, see <http://www.gnu.org/licenses/>.
 */

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

import com.shooshosha.darksouls.DarkSoulsCraft;
import com.shooshosha.darksouls.config.ConfigGeneral;
import com.shooshosha.darksouls.config.ConfigItem;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author shooshosha
 */
public class ConfigurationHelper {
    private static File allModsConfigurationsDirectory;
    private static String absoultePathOfThisModsConfigurationDirectory;
    private static File generalModConfigurations;
    private static File itemModConfigurations;

    public static void initializeFiles(FMLPreInitializationEvent preLoadingEvent) {
        getModConfigurationsPaths(preLoadingEvent);
        ConfigGeneral.initialize(generalModConfigurations);
        ConfigItem.initialize(itemModConfigurations);
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
        return absoultePathOfThisModsConfigurationDirectory + DarkSoulsCraft.ID + configurationFileName;
    }
}
