package com.shooshosha.darksouls.item.weapon.whip;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Whip extends Whips {
	
	public Whip() {
		super();
		setUnlocalizedName("whip");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(84, 0, 0, 0);
		setTypes(true, false, false, false);
		setCriticalDamage(100);
		setDurability(200);
		setWeight(15);
		setRequirements(7, 14, 0, 0);
		setBonuses(Bonus.Z, Bonus.B, Bonus.Z, Bonus.Z);
		setReductions(30, 10, 20, 20);
		setStability(16);
	}

}
