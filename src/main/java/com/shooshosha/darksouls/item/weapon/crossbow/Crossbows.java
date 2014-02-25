package com.shooshosha.darksouls.item.weapon.crossbow;

import com.shooshosha.darksouls.item.weapon.Weapon;
import com.shooshosha.darksouls.library.Reference;

abstract class Crossbows extends Weapon {
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
