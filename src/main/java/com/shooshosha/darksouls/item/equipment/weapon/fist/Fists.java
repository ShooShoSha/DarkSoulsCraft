package com.shooshosha.darksouls.item.equipment.weapon.fist;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

abstract class Fists extends DSCItemWeapon {
	Fists(String unlocalName) {
		super("fists." + unlocalName);
	}
}
