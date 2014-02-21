package com.shooshosha.darksouls.item.weapon.sword;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Shortsword extends StraightSwords {

	@Override
	protected void setBaseStatuses() {
		setDamages(78, 0, 0, 0);
		setReductions(50, 10, 35, 35);
		setRequirements(8, 10, 0, 0);
		setBonuses(Bonus.C, Bonus.C, Bonus.Z, Bonus.Z);
		setTypes(true, false, false, true);
		setCriticalDamage(100);
		setWeight(20);
		setDurability(200);
		setStability(32);
		setSoulValue(50);
	}

}
