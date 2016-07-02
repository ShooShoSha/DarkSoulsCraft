package com.shooshosha.darksouls.item.equipment.armor.head;

import com.shooshosha.darksouls.item.equipment.armor.DSCItemArmor;

/**
 * @author shooshosha
 */
public abstract class Heads extends DSCItemArmor {
    public Heads(String unlocalName, ArmorMaterial material, int renderIndex) {
        super("head." + unlocalName, material, renderIndex, HELM);
    }
}
