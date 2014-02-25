package com.shooshosha.darksouls.item.weapon.hammer;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Mace extends Hammers {
	public Mace() {
		super();
		setUnlocalizedName("mace");
		setTextureName(getUnlocalizedName());
	}
	@Override
	protected void setBaseStatuses() {
		setDamages(91, 0, 0, 0);
		setReductions(45, 10, 30, 30);
		setRequirements(12, 0, 0, 0);
		setBonuses(Bonus.B, Bonus.Z, Bonus.Z, Bonus.Z);
		setTypes(false, true, false, false);
		setCriticalDamage(100);
		setWeight(40);
		setDurability(250);
		setSoulValue(0);
		setStability(30);
	}

}
