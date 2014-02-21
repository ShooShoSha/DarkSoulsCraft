package com.shooshosha.darksouls.item.weapon.sword;

import com.shooshosha.darksouls.item.weapon.Upgrade;
import com.shooshosha.darksouls.item.weapon.Weapon;

abstract class StraightSwords extends Weapon {
	public StraightSwords() {
		super();
		setPath(Upgrade.NORMAL);
		setModifier(0);
	}
}
