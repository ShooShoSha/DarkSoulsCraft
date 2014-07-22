package com.shooshosha.darksouls.item.equipment.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

import java.util.HashSet;
import java.util.Set;

public class DSCItemArmor extends ItemArmor {
    public static final int HELM = 0;
    public static final int CHEST = 1;
    public static final int LEG = 2;
    public static final int HAND = 3;

    private static Set<DSCItemArmor> armors = new HashSet<DSCItemArmor>();

	public DSCItemArmor(String unlocalName, ArmorMaterial material, int renderIndex, int armorSlot) {
		super(material, renderIndex, armorSlot);
        setUnlocalizedName("armor." + unlocalName);
        setCreativeTab(CreativeTabs.tabCombat);
        armors.add(this);
	}

}
