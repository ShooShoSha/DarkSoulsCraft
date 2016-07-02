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

package com.shooshosha.darksouls.item.equipment.weapon.spelltool.talisman;

import com.shooshosha.darksouls.item.equipment.weapon.spelltool.DSCSpellTool;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shooshosha
 */
public abstract class Talismans extends DSCSpellTool {
    private static Set<Talismans> talismans = new HashSet<Talismans>();

    public Talismans(String unlocalName) {
        super("talisman." + unlocalName);
        talismans.add(this);
    }

    public static Set<Talismans> getTalismans() {
        return talismans;
    }
}
