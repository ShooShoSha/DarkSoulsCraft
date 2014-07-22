package com.shooshosha.darksouls.item.equipment.armor.chest;

import com.shooshosha.darksouls.item.equipment.armor.DSCItemArmor;

/**
 * @author shooshosha
 */
public abstract class Chests extends DSCItemArmor {
    public Chests(String unlocalName, ArmorMaterial material, int renderIndex) {
        super("chest." + unlocalName, material, renderIndex, CHEST);
    }
}
