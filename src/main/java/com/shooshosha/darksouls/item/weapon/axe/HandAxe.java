package com.shooshosha.darksouls.item.weapon.axe;

import com.shooshosha.darksouls.item.weapon.Bonus;
import com.shooshosha.darksouls.item.weapon.DSCItemWeapon;

public class HandAxe extends DSCItemWeapon implements Axes {
	public HandAxe() {
		super();
		setUnlocalizedName("handaxe");
		setTextureName(getUnlocalizedName());
	}
	@Override
	protected void setBaseStatuses() {
		setDamages(80, 0, 0, 0);
		setReductions(55, 10, 40, 40);
		setRequirements(8, 8, 0, 0);
		setBonuses(Bonus.C, Bonus.D, Bonus.Z, Bonus.Z);
		setTypes(true, false, false, false);
		setCriticalDamage(100);
		setWeight(20);
		setDurability(250);
		setSoulValue(0);
		setStability(36);
	}

}
