/**
 * DarkSoulsCraft
 * 
 * ModItems.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import com.shooshosha.darksouls.item.HomewardBone;
import com.shooshosha.darksouls.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class ItemsHelper {
	//Mod item instances
	public static Item boneHomeward;
	
	public static void init() {
		//Initialize each item individually
		boneHomeward = new HomewardBone(ItemIds.HOMEWARD_BONE);
		
		//Register items with GameRegistry
		GameRegistry.registerItem(boneHomeward, ItemIds.HOMEWARD_BONE_NAME);
		
		//Add recipes for items
		GameRegistry.addShapelessRecipe(new ItemStack(boneHomeward), new ItemStack(Item.bone), new ItemStack(Item.bed));
	}
}
