/**
 * Copyright 2013 Kevin O'Brien (shooshosha@gmail.com) (License: LGPLv3 or later)
 *
 * This file is part of Dark Souls Craft.
 *
 * Dark Souls Craft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * Dark Souls Craft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Dark Souls Craft.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.shooshosha.darksouls.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


/**
 * @author shooshosha
 */
public class DSCBlocks {
    public static Block bonfire;

    public static void initialize() {
        createBlocks();
        registerBlocks();
        registerRecipes();
    }

    private static void createBlocks() {
        bonfire = new Bonfire();
    }

    private static void registerBlocks() {
        GameRegistry.registerBlock(bonfire, bonfire.getUnlocalizedName());
    }

    private static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(bonfire), DSCBlockRecipe.bonfire);
    }
}
