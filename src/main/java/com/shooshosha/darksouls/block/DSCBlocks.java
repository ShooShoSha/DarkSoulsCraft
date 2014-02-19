/**
 * DarkSoulsCraft
 * 
 * Blocks.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
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
