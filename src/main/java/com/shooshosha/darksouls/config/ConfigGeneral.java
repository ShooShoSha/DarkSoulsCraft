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
    private static final String NAME = "General";

    private static boolean configTest = false;

    public static void loadGeneralConfigurations(Configuration configuration) {
        LogHelper.trace("Loading general configurations");
        configTest = configuration.getBoolean("configTest", Configuration.CATEGORY_GENERAL, configTest, "Example configuration value.", "en_US");
    }
}
