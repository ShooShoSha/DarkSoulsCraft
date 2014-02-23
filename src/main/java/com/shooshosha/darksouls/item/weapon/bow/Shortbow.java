package com.shooshosha.darksouls.item.weapon.bow;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Shortbow extends Bows {

	@Override
	protected void setBaseStatuses() {
		setDamages(31, 0, 0, 0);
		setReductions(0, 0, 0, 0);
		setBonuses(Bonus.D, Bonus.A, Bonus.Z, Bonus.Z);
		setRequirements(7, 12, 0, 0);
		setTypes(true, false, false, false);
		setWeight(5);
		setRange(50);
		setDurability(100);
		setCriticalDamage(100);
	}

}
