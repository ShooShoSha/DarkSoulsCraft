package com.shooshosha.darksouls.item.equipment.armor.hand;

import com.shooshosha.darksouls.item.equipment.armor.DSCItemArmor;

/**
 * @author shooshosha
 */
public abstract class Hands extends DSCItemArmor {
    public Hands(String unlocalName, ArmorMaterial material, int renderIndex) {
        super("hand." + unlocalName, material, renderIndex, HAND);
    }
}
