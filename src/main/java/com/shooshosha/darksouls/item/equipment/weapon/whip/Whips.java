package com.shooshosha.darksouls.item.equipment.weapon.whip;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

abstract class Whips extends DSCItemWeapon {
	Whips(String unlocalName) {
		super("whips." + unlocalName);
	}
    //Cannot be parried
    //No critical attacks (backstabs, riposte, plunging)
}
