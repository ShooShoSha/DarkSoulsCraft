package com.shooshosha.darksouls.item.armor;

import com.shooshosha.darksouls.DarkSoulsCraft;
import net.minecraft.item.ItemArmor;

public class DSCItemArmor extends ItemArmor {
    public static final String localePrefix = "armor." + DarkSoulsCraft.LOCALE;

	public DSCItemArmor(ArmorMaterial material, int renderIndex_, int armorSlot) {
		super(material, renderIndex_, armorSlot);
	}

}
