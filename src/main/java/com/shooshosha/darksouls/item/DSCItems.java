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

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;
import com.shooshosha.darksouls.item.equipment.weapon.fist.Caestus;
import com.shooshosha.darksouls.item.equipment.weapon.halberd.Halberd;
import com.shooshosha.darksouls.item.equipment.weapon.hammer.Mace;
import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;


/**
 * @author shooshosha
 */
public class DSCItems {
    public static Item homewardbone;
    public static DSCItemWeapon halberd;
    public static DSCItemWeapon mace;
    public static DSCItemWeapon caestus;
    public static HashSet<DSCItemWeapon> weapons = new HashSet<DSCItemWeapon>();

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
        for (Item weapon : weapons) {
            GameRegistry.registerItem(weapon, weapon.getUnlocalizedName());
        }
    }
}
