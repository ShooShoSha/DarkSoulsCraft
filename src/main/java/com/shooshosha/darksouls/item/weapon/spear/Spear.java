package com.shooshosha.darksouls.item.weapon.spear;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Spear extends Spears {
	
	public Spear() {
		super();
		setUnlocalizedName("spear");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(80, 0, 0, 0);
		setReductions(40, 10, 30, 30);
		setRequirements(11, 10, 0, 0);
		setBonuses(Bonus.D, Bonus.C, Bonus.Z, Bonus.Z);
		setTypes(false, false, false, true);
		setCriticalDamage(100);
		setWeight(35);
		setDurability(180);
		setSoulValue(0);
		setStability(26);
	}

}
