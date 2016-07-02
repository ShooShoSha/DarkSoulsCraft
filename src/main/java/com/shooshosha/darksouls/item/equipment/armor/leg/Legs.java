package com.shooshosha.darksouls.item.equipment.armor.leg;

import com.shooshosha.darksouls.item.equipment.armor.DSCItemArmor;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * @author shooshosha
 */
public abstract class Legs extends DSCItemArmor {
    public Legs(String unlocalName, ArmorMaterial material, int renderIndex) {
        super("leg." + unlocalName, material, renderIndex, EntityEquipmentSlot.LEGS);
    }
}
