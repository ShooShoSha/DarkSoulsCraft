package com.shooshosha.darksouls.item.weapon.crossbow;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class LightCrossbow extends Crossbows {
	public LightCrossbow() {
		super();
		setUnlocalizedName("lightcrossbow");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(50, 0, 0, 0);
		setRange(50);
		setDurability(150);
		setWeight(30);
		setRequirements(10, 8, 0, 0);
		setBonuses(Bonus.Z, Bonus.Z, Bonus.Z, Bonus.Z);
		setTypes(true, false, false, false);
		setReductions(0, 0, 0, 0);
	}

}
