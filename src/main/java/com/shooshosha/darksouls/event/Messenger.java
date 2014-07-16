/*
 * Copyright 2014. Kevin "shooshosha" O'Brien (shooshosha@gmail.com) License: LGPLv3 or later
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

import com.pahimar.ee3.util.LogHelper;
import cpw.mods.fml.common.event.FMLInterModComms;

/**
 * @author shooshosha
 */
public class Messenger {
    public static void handle(FMLInterModComms event) {
        LogHelper.debug("");
    }

    public static void handle(FMLInterModComms.IMCEvent event) {
        for (FMLInterModComms.IMCMessage m : event.getMessages()) {
            LogHelper.trace("Message from %s: %s", m.getSender(), m.getStringValue());
        }
    }
}
