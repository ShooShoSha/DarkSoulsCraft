/**
 * DarkSoulsCraft
 *
 * Items.java
 *
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.init;

import java.util.HashSet;
import java.util.Set;

import com.shooshosha.darksouls.item.DSCItem;
import com.shooshosha.darksouls.item.HomewardBone;
import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;
import com.shooshosha.darksouls.item.equipment.weapon.axe.BattleAxe;
import com.shooshosha.darksouls.item.equipment.weapon.axe.HandAxe;
import com.shooshosha.darksouls.item.equipment.weapon.bow.Longbow;
import com.shooshosha.darksouls.item.equipment.weapon.bow.Shortbow;
import com.shooshosha.darksouls.item.equipment.weapon.crossbow.HeavyCrossbow;
import com.shooshosha.darksouls.item.equipment.weapon.crossbow.LightCrossbow;
import com.shooshosha.darksouls.item.equipment.weapon.dagger.BanditsKnife;
import com.shooshosha.darksouls.item.equipment.weapon.dagger.Dagger;
import com.shooshosha.darksouls.item.equipment.weapon.fist.Caestus;
import com.shooshosha.darksouls.item.equipment.weapon.fist.Claw;
import com.shooshosha.darksouls.item.equipment.weapon.halberd.Halberd;
import com.shooshosha.darksouls.item.equipment.weapon.halberd.Lucerne;
import com.shooshosha.darksouls.item.equipment.weapon.hammer.Club;
import com.shooshosha.darksouls.item.equipment.weapon.hammer.Mace;
import com.shooshosha.darksouls.item.equipment.weapon.spear.Pike;
import com.shooshosha.darksouls.item.equipment.weapon.spear.Spear;
import com.shooshosha.darksouls.item.equipment.weapon.sword.Longsword;
import com.shooshosha.darksouls.item.equipment.weapon.sword.Shortsword;
import com.shooshosha.darksouls.item.equipment.weapon.whip.GuardianTail;
import com.shooshosha.darksouls.item.equipment.weapon.whip.NotchedWhip;
import com.shooshosha.darksouls.item.equipment.weapon.whip.Whip;
import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;


/**
 * @author shooshosha
 */
public class DSCItems {

    public static void initialize() {
        createItems();
        registerItems();
    }

    private static void createItems() {
        new BattleAxe();
        new HandAxe();
        new Longbow();
        new Shortbow();
        new HeavyCrossbow();
        new LightCrossbow();
        new BanditsKnife();
        new Dagger();
        new Caestus();
        new Claw();
        new Halberd();
        new Lucerne();
        new Club();
        new Mace();
        new Pike();
        new Spear();
        new Longsword();
        new Shortsword();
        new GuardianTail();
        new NotchedWhip();
        new Whip();
    }

    private static void registerItems() {
        for (Item item : DSCItem.getItems()) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }
}
