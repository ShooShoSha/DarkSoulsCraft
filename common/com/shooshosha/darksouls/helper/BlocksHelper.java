/**
 * DarkSoulsCraft
 * 
 * BlocksHelper.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import com.shooshosha.darksouls.block.Bonfire;
import com.shooshosha.darksouls.lib.BlockIds;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public class BlocksHelper {
	/* Mod block instances */
	public static Block bonfire;
		
		
	public static void init() {
		bonfire = new Bonfire(BlockIds.BONFIRE);
		
		initBlockRegistries();
		
		initBlockRecipes();
	}


	/**
	 * 
	 */
	private static void initBlockRegistries() {
		GameRegistry.registerBlock(bonfire, BlockIds.BONFIRE_NAME);
	}


	/**
	 * 
	 */
	private static void initBlockRecipes() {
		GameRegistry.addRecipe(new ItemStack(bonfire), new Object[] {" s ", " b ", "ccc", Character.valueOf('s'), Item.swordIron, Character.valueOf('b'), Item.bone, Character.valueOf('c'), Item.coal});
	}
}
