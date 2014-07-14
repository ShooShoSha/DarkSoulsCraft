package com.shooshosha.darksouls.item.equipment.weapon.bow;


import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;
import com.shooshosha.darksouls.item.equipment.weapon.Projectile;

abstract class Bows extends DSCItemWeapon implements Projectile {
	private int range;
	Bows(String unlocalName) {
		super("bows." + unlocalName);
	}
	
	public final void setRange(int range) {
		this.range = range;
	}
	
	public final int getRange() {
		return range;
	}
}
