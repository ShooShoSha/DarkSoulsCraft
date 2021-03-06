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
import com.shooshosha.darksouls.DarkSoulsCraft;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;

/**
 * @author shooshosha
 */
public class Fingerprint {
    public static void handle(FMLFingerprintViolationEvent event) {
        if (DarkSoulsCraft.FINGERPRINT.equals("@FINGERPRINT@")) {
            LogHelper.warn("This copy of %s is a development version and thus may be unstable, incomplete, or both", DarkSoulsCraft.NAME);
        } else {
            LogHelper.error("This copy of %s was modified from the original and may be harmful. Please re-download the original from an appropriate site", DarkSoulsCraft.NAME);
        }
    }
}
