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
 * ItemDS.java
 *
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.item;

import com.shooshosha.darksouls.DarkSoulsCraft;
import com.shooshosha.darksouls.proxy.Proxy;
import net.minecraft.item.Item;

/**
 * @author shooshosha
 */
public class DSCItem extends Item {
    private static final String localePrefix = DarkSoulsCraft.LOCALE;

    public DSCItem(String unlocalName) {
        super();
        setUnlocalizedName(unlocalName);
        setTextureName(getUnlocalizedName());
        this.maxStackSize = 64;
        this.setNoRepair();
        this.setCreativeTab(Proxy.DSCtab);
    }

    @Override
    public String getUnlocalizedName() {
        return localePrefix + super.getUnlocalizedName();
    }
}
