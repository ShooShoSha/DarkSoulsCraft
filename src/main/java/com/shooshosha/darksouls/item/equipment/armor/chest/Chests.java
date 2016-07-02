package com.shooshosha.darksouls.item.equipment.armor.chest;

import com.shooshosha.darksouls.item.equipment.armor.DSCItemArmor;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * @author shooshosha
 */
public abstract class Chests extends DSCItemArmor {
    public Chests(String unlocalName, ArmorMaterial material, int renderIndex) {
        super("chest." + unlocalName, material, renderIndex, EntityEquipmentSlot.CHEST);
    }
}
