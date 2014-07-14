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

import java.io.File;

import com.pahimar.ee3.util.LogHelper;
import com.shooshosha.darksouls.DarkSoulsCraft;
import net.minecraftforge.common.config.Configuration;

/**
 * @author shooshosha
 * @date Dec 10, 2013
 */
public class ConfigItem {
    private static Configuration itemConfiguration;

    public static void initialize(File itemConfigurations) {
        itemConfiguration = new Configuration(itemConfigurations);


        try {
            itemConfiguration.load();

            readItemConfigurations();

        } catch (Exception e) {
            LogHelper.error("%s encountered a problem loading its item configurations", DarkSoulsCraft.ID, e);
        } finally {
            itemConfiguration.save();
        }
    }

    private static void readItemConfigurations() {
        //TODO read item configuration file
    }
}
