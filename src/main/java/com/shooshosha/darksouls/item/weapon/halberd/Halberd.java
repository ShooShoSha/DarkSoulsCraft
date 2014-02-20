package com.shooshosha.darksouls.item.weapon.halberd;

import com.shooshosha.darksouls.item.weapon.Bonus;



public class Halberd extends Halberds {
	public Halberd() {
		super();
		setUnlocalizedName("halberd");
		setTextureName(getUnlocalizedName());
		setBaseStatuses();
	}

	protected void setBaseStatuses() {
		setDamages(110,0,0,0);
		setReductions(40,10,30,30);
		setRequirements(16,12,0,0);
		setBonuses(Bonus.D, Bonus.D, Bonus.Z, Bonus.Z);
		setTypes(true, false, false, true);
		setCritcalDamage(100);
		setWeight(60);
		setDurability(200);
		setSoulValue(50);
	}
}
