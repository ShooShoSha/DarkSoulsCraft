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

import java.util.HashSet;

import com.shooshosha.darksouls.item.weapon.fist.Caestus;
import com.shooshosha.darksouls.item.weapon.halberd.Halberd;
import com.shooshosha.darksouls.item.weapon.hammer.Mace;
import net.minecraft.item.Item;

import com.shooshosha.darksouls.item.weapon.Weapon;

import cpw.mods.fml.common.registry.GameRegistry;


/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public class DSCItems {
public static Item homewardbone;
public static Weapon halberd;
public static Weapon mace;
public static Weapon caestus;
public static HashSet<Weapon> weapons = new HashSet<Weapon>();
	
	public static void initialize() {
		createItems();
		registerItems();
	}

	private static void createItems() {
		homewardbone = new HomewardBone();
		weapons.add(new Halberd());
		weapons.add(new Mace());
		weapons.add(new Caestus());
	}
	
	private static void registerItems() {
		GameRegistry.registerItem(homewardbone, homewardbone.getUnlocalizedName());
		for(Item weapon : weapons) {
			GameRegistry.registerItem(weapon, weapon.getUnlocalizedName());
		}
	}
}
