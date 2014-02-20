package com.shooshosha.darksouls.item.weapon;

import com.shooshosha.darksouls.item.DSCItem;
import com.shooshosha.darksouls.language.Localization;

public class Halberd extends DSCItem {
	public Halberd() {
		super();
		setUnlocalizedName(Localization.Items.halberd.unlocal());
		setTextureName(getUnlocalizedName());
		maxStackSize = 1;
	}
}
