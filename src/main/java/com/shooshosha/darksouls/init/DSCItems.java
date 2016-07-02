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

import com.shooshosha.darksouls.item.DSCItem;
import com.shooshosha.darksouls.item.HomewardBone;
import com.shooshosha.darksouls.item.equipment.armor.chest.EliteKnightChest;
import com.shooshosha.darksouls.item.equipment.armor.chest.KnightChest;
import com.shooshosha.darksouls.item.equipment.armor.hand.EliteKnightHand;
import com.shooshosha.darksouls.item.equipment.armor.hand.KnightHand;
import com.shooshosha.darksouls.item.equipment.armor.head.EliteKnightHead;
import com.shooshosha.darksouls.item.equipment.armor.head.KnightHead;
import com.shooshosha.darksouls.item.equipment.armor.leg.EliteKnightLeg;
import com.shooshosha.darksouls.item.equipment.armor.leg.KnightLeg;
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
import com.shooshosha.darksouls.item.equipment.weapon.shield.Buckler;
import com.shooshosha.darksouls.item.equipment.weapon.shield.GrassCrest;
import com.shooshosha.darksouls.item.equipment.weapon.spear.Pike;
import com.shooshosha.darksouls.item.equipment.weapon.spear.Spear;
import com.shooshosha.darksouls.item.equipment.weapon.spelltool.catalyst.Sorcerers;
import com.shooshosha.darksouls.item.equipment.weapon.spelltool.catalyst.TinBanishment;
import com.shooshosha.darksouls.item.equipment.weapon.spelltool.pyromancy.PyromancyFlame;
import com.shooshosha.darksouls.item.equipment.weapon.spelltool.talisman.Sunlight;
import com.shooshosha.darksouls.item.equipment.weapon.spelltool.talisman.Talisman;
import com.shooshosha.darksouls.item.equipment.weapon.sword.Longsword;
import com.shooshosha.darksouls.item.equipment.weapon.sword.Shortsword;
import com.shooshosha.darksouls.item.equipment.weapon.whip.GuardianTail;
import com.shooshosha.darksouls.item.equipment.weapon.whip.NotchedWhip;
import com.shooshosha.darksouls.item.equipment.weapon.whip.Whip;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


/**
 * @author shooshosha
 */
public class DSCItems {

    public static void initialize() {
        createItems();
        registerItems();
    }

    private static void createItems() {
        new HomewardBone();
        createEquipment();
    }

    private static void createEquipment() {
        createArmors();
        createWeapons();
    }

    private static void createArmors() {
        createChests();
        createHands();
        createHeads();
        createLegs();
    }

    private static void createChests() {
        new EliteKnightChest();
        new KnightChest();
    }
    private static void createHands() {
        new EliteKnightHand();
        new KnightHand();
    }
    private static void createHeads() {
        new EliteKnightHead();
        new KnightHead();
    }
    private static void createLegs() {
        new EliteKnightLeg();
        new KnightLeg();
    }

    private static void createWeapons() {
        createAxes();
        createBows();
        createCrossBows();
        createDaggers();
        createFists();
        createHalberds();
        createHammers();
        createShields();
        createSpears();
        createSpellTools();
        createSwords();
        createWhips();
    }

    private static void createAxes() {
        new BattleAxe();
        new HandAxe();
    }
    private static void createBows() {
        new Longbow();
        new Shortbow();
    }
    private static void createCrossBows() {
        new HeavyCrossbow();
        new LightCrossbow();
    }
    private static void createDaggers() {
        new BanditsKnife();
        new Dagger();
    }
    private static void createFists() {
        new Caestus();
        new Claw();
    }
    private static void createHalberds() {
        new Halberd();
        new Lucerne();
    }
    private static void createHammers() {
        new Club();
        new Mace();
    }
    private static void createShields() {
        new Buckler();
        new GrassCrest();
    }
    private static void createSpears() {
        new Pike();
        new Spear();
    }
    private static void createSpellTools() {
        createCatalysts();
        createPyromancies();
        createTalismans();
    }
    private static void createSwords() {
        new Longsword();
        new Shortsword();
    }
    private static void createWhips() {
        new GuardianTail();
        new NotchedWhip();
        new Whip();
    }

    private static void createCatalysts() {
        new Sorcerers();
        new TinBanishment();
    }
    private static void createPyromancies() {
        new PyromancyFlame();
    }
    private static void createTalismans() {
        new Talisman();
        new Sunlight();
    }

    private static void registerItems() {
        for (Item item : DSCItem.getItems()) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }
}
