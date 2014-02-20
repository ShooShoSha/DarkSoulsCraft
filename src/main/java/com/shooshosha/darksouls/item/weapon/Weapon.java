package com.shooshosha.darksouls.item.weapon;

import com.shooshosha.darksouls.item.DSCItem;

public abstract class Weapon extends DSCItem {
	private int physicalDamage;

	public int getPhysicalDamage() {
		return physicalDamage;
	}

	public void setPhysicalDamage(int physicalDamage) {
		this.physicalDamage = physicalDamage;
	}
}
