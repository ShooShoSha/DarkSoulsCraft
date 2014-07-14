package com.shooshosha.darksouls.item.equipment.weapon.crossbow;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;
import com.shooshosha.darksouls.item.equipment.weapon.Projectile;

abstract class Crossbows extends DSCItemWeapon implements Projectile {
	private int range;
	
	public Crossbows(String unlocalName) {
		super("crossbows." + unlocalName);
	}
	
	public final void setRange(int range) {
			this.range = range;
	}
	
	public final int getRange() {
		return range;
	}
}
