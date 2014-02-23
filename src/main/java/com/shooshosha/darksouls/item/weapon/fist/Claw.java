package com.shooshosha.darksouls.item.weapon.fist;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Claw extends Fists {

	@Override
	protected void setBaseStatuses() {
		setDamages(72, 0, 0, 0);
		setReductions(0, 0, 0, 0);
		setBonuses(Bonus.E, Bonus.B, Bonus.Z, Bonus.Z);
		setRequirements(6, 14, 0, 0);
		setTypes(false, false, true, false);
		setWeight(10);
		setStability(0);
		setAuxiliaryEffects(300, 0, 0, 0, 0);
	}

}
