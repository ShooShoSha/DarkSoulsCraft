package com.shooshosha.darksouls.item.equipment.armor.hand;

import com.shooshosha.darksouls.item.equipment.armor.DSCItemArmor;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * @author shooshosha
 */
public abstract class Hands extends DSCItemArmor {
    //TODO: Implement armor system with more slots
    public Hands(String unlocalName, ArmorMaterial material, int renderIndex) {
        super("hand." + unlocalName, material, renderIndex, EntityEquipmentSlot.OFFHAND);
    }
}
