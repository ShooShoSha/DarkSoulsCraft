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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shooshosha
 */
public class DSCItem extends Item {
    private static Set<DSCItem> items = new HashSet<DSCItem>();

    public DSCItem(String unlocalName) {
        super();
        setUnlocalizedName(unlocalName);
        this.maxStackSize = 64;
        this.setNoRepair();
        items.add(this);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("%s.%s", DarkSoulsCraft.ID, super.getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return getUnlocalizedName();
    }

    public static Set<DSCItem> getItems() {
        return items;
    }
}
