package com.shooshosha.darksouls.item.weapon.crossbow;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class HeavyCrossbow extends Crossbows {
	public HeavyCrossbow() {
		super();
		setUnlocalizedName("heavycrossbow");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(55, 0, 0, 0);
		setRange(50);
		setDurability(150);
		setWeight(50);
		setRequirements(14, 8, 0, 0);
		setBonuses(Bonus.Z, Bonus.Z, Bonus.Z, Bonus.Z);
	}

}
