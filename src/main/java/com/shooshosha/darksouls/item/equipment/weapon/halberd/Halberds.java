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

package com.shooshosha.darksouls.item.equipment.weapon.halberd;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;


abstract class Halberds extends DSCItemWeapon {
    private static Set<Halberds> instances = new HashSet<Halberds>();

    protected Halberds(String unlocalName) {
        super("halberds." + unlocalName);
        instances.add(this);
    }

    public static Set<Halberds> getInstances() {
        return instances;
    }
    //if attack doesn't connect, player stumbles
}
