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

import com.shooshosha.darksouls.item.weapon.fist.Caestus;
import com.shooshosha.darksouls.item.weapon.hammer.Mace;

import net.minecraft.item.Item;

import com.shooshosha.darksouls.item.weapon.halberd.Halberd;

import cpw.mods.fml.common.registry.GameRegistry;


/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public class DSCItems {
public static Item homewardbone;
public static Item halberd;
public static Item mace;
public static Item caestus;
	
	public static void initialize() {
		createItems();
		registerItems();
	}

	private static void createItems() {
		homewardbone = new HomewardBone();
		halberd = new Halberd();
		mace = new Mace();
		caestus = new Caestus();
	}
	
	private static void registerItems() {
		GameRegistry.registerItem(homewardbone, homewardbone.getUnlocalizedName());
		GameRegistry.registerItem(halberd, halberd.getUnlocalizedName());
		GameRegistry.registerItem(caestus, caestus.getUnlocalizedName());
	}
}
