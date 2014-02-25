package com.shooshosha.darksouls.item.weapon.fist;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Caestus extends Fists {
	public Caestus() {
		super();
		setUnlocalizedName("caestus");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(66, 0, 0, 0);
		setReductions(0, 0, 0, 0);
		setRequirements(5, 8, 0, 0);
		setBonuses(Bonus.C, Bonus.C, Bonus.Z, Bonus.Z);
		setTypes(false, true, false, false);
		setCriticalDamage(100);
		setWeight(5);
		setSoulValue(50);
		setStability(0);
	}

}
