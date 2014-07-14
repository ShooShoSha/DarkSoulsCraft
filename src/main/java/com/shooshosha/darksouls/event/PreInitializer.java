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
package com.shooshosha.darksouls.event;

import com.shooshosha.darksouls.block.DSCBlocks;
import com.shooshosha.darksouls.helper.ConfigurationHelper;
import com.shooshosha.darksouls.helper.VersionHelper;
import com.shooshosha.darksouls.item.DSCItems;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author shooshosha
 * @date Feb 4, 2014
 */
public final class PreInitializer {
    public static void handle(FMLPreInitializationEvent preInitializeEvent) {
        ConfigurationHelper.initializeFiles(preInitializeEvent);

        try {
            VersionHelper.runCheck();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DSCItems.initialize();

        DSCBlocks.initialize();
    }
}
