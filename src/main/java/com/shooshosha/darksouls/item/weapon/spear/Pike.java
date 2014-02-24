package com.shooshosha.darksouls.item.weapon.spear;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Pike extends Spears {

	@Override
	protected void setBaseStatuses() {
		setDamages(86, 0, 0, 0);
		setReductions(40, 10, 30, 30);
		setRequirements(24, 10, 0, 0);
		setBonuses(Bonus.D, Bonus.C, Bonus.Z, Bonus.Z);
		setCriticalDamage(100);
		setWeight(100);
		setDurability(180);
		setSoulValue(0);
		setStability(26);
	}

}
