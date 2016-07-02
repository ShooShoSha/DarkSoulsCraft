package com.shooshosha.darksouls.item.equipment.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.HashSet;
import java.util.Set;

public class DSCItemArmor extends ItemArmor {

    private static Set<DSCItemArmor> armors = new HashSet<DSCItemArmor>();

	public DSCItemArmor(String unlocalName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorSlot) {
		super(material, renderIndex, armorSlot);
        setUnlocalizedName("armor." + unlocalName);
        setCreativeTab(CreativeTabs.COMBAT);
        armors.add(this);
	}

}
