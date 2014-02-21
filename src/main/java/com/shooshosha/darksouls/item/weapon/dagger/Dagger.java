package com.shooshosha.darksouls.item.weapon.dagger;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Dagger extends Daggers {
	public Dagger() {
		super();
		setUnlocalizedName("dagger");
		setTextureName(getUnlocalizedName());
	}
	@Override
	protected void setBaseStatuses() {
		setDamages(56, 0, 0, 0);
		setReductions(45, 10, 30, 30);
		setRequirements(5, 8, 0, 0);
		setBonuses(Bonus.E, Bonus.B, Bonus.Z, Bonus.Z);
		setTypes(true, false, false, false);
		setCriticalDamage(131);
		setWeight(5);
		setDurability(200);
		setSoulValue(50);
		setStability(26);
	}

}
