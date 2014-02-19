/**
 * DarkSoulsCraft
 * 
 * Items.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public class DSCItems {
public static Item homewardbone;
	
	public static void initialize() {
		createItems();
		registerItems();
	}

	private static void createItems() {
		homewardbone = new HomewardBone();
	}
	
	private static void registerItems() {
		GameRegistry.registerItem(homewardbone, homewardbone.getUnlocalizedName());
	}
}
