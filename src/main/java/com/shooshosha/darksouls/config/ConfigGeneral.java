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
package com.shooshosha.darksouls.config;


import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

import java.io.File;

import com.pahimar.ee3.util.LogHelper;
import com.shooshosha.darksouls.DarkSoulsCraft;
import net.minecraftforge.common.config.Configuration;


/**
 * @author shooshosha
 */
public class ConfigGeneral {
    private static Configuration generalConfiguration;

    public static void initialize(File generalConfigurations) {
        generalConfiguration = new Configuration(generalConfigurations);

        try {
            generalConfiguration.load();

            getVersionInformation();

        } catch (Exception e) {
            LogHelper.error("%s encountered a problem loading its general configurations", DarkSoulsCraft.ID);
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
        ConfigVersion.VERSION_RESULT = generalConfiguration.get(CATEGORY_GENERAL,
                ConfigVersion.VERSION_RESULT_NAME,
                ConfigVersion.VERSION_RESULT_DEFAULT).getBoolean(ConfigVersion.VERSION_RESULT_DEFAULT);
    }

    private static void getLastDiscoveredVersion() {
        ConfigVersion.VERSION_DISCOVERED = generalConfiguration.get(CATEGORY_GENERAL,
                ConfigVersion.VERSION_DISCOVERED_NAME,
                ConfigVersion.VERSION_DISCOVERED_DEFAULT).getString();
    }

    private static void getTypeOfLastDiscoveredVersion() {
        ConfigVersion.VERSION_TYPE = generalConfiguration.get(CATEGORY_GENERAL,
                ConfigVersion.VERSION_TYPE_NAME,
                ConfigVersion.VERSION_TYPE_DEFAULT).getString();
    }

    public static void set(String categoryName, String propertyName, String newValue) {
        generalConfiguration.load();
        if (generalConfiguration.getCategoryNames().contains(categoryName)) {
            if (generalConfiguration.getCategory(categoryName).containsKey(propertyName)) {
                generalConfiguration.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
    }
}
