package com.shooshosha.darksouls.item.weapon.bow;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Longbow extends Bows {

	@Override
	protected void setBaseStatuses() {
		setDamages(36,0,0,0);
		setReductions(0, 0, 0, 0);
		setBonuses(Bonus.D, Bonus.A, Bonus.Z, Bonus.Z);
		setRequirements(9, 14, 0, 0);
		setTypes(true, false, false, false);
		setWeight(10);
		setCriticalDamage(100);
		setRange(50);
		setDurability(100);
	}

}
