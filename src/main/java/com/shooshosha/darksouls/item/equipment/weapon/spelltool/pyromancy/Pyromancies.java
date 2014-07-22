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

package com.shooshosha.darksouls.item.equipment.weapon.spelltool.pyromancy;

import com.shooshosha.darksouls.item.equipment.weapon.spelltool.DSCSpellTool;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shooshosha
 */
public abstract class Pyromancies extends DSCSpellTool {
    private static Set<Pyromancies> pyromancies = new HashSet<Pyromancies>();

    public Pyromancies(String unlocalName) {
        super("pyromancy." + unlocalName);
        pyromancies.add(this);
    }

    public static Set<Pyromancies> getPyromancies() {
        return pyromancies;
    }
}
