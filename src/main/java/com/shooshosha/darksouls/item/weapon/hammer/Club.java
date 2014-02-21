package com.shooshosha.darksouls.item.weapon.hammer;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Club extends Hammers {
	public Club() {
		super();
		setUnlocalizedName("club");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(87, 0, 0, 0);
		setReductions(45, 10, 30, 30);
		setRequirements(10, 0, 0, 0);
		setBonuses(Bonus.A, Bonus.Z, Bonus.Z, Bonus.Z);
		setTypes(false, true, false, false);
		setCriticalDamage(100);
		setWeight(30);
		setDurability(250);
		setSoulValue(0);
		setStability(30);
	}

}
