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
package com.shooshosha.darksouls.creativetab;

import com.shooshosha.darksouls.DarkSoulsCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * @author shooshosha
 */
public class DSCCreativeTab extends CreativeTabs {

    public DSCCreativeTab(String tabLabel) {
        super(tabLabel);
    }

    @Override
    public String getTranslatedTabLabel() {
        return DarkSoulsCraft.LOCALE + super.getTabLabel();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.portal);
    }

}
