package com.shooshosha.darksouls.item.weapon.bow;


import com.shooshosha.darksouls.item.weapon.Weapon;
import com.shooshosha.darksouls.lib.Reference;

abstract class Bows extends Weapon {
	private int range;
	Bows() {
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
