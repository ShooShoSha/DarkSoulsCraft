package com.shooshosha.darksouls.item.weapon.crossbow;

import com.shooshosha.darksouls.item.weapon.DSCItemWeapon;

abstract class Crossbows extends DSCItemWeapon {
	private int range;
	
	Crossbows() {
		super();
	}
	
	public final void setRange(int range) {
		if(!Reference.isNegative(range))
			this.range = range;
	}
	
	public final int getRange() {
		return range;
	}
}
