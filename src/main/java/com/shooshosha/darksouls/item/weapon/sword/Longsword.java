package com.shooshosha.darksouls.item.weapon.sword;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class Longsword extends StraightSwords {
	public Longsword() {
		super();
		setUnlocalizedName("longsword");
		setTextureName(getUnlocalizedName());
		setBaseStatuses();
	}
	@Override
	protected void setBaseStatuses() {
		setDamages(80, 0, 0, 0);
		setReductions(50, 10, 35, 35);
		setRequirements(10, 10, 0, 0);
		setBonuses(Bonus.C, Bonus.C, Bonus.Z, Bonus.Z);
		setTypes(true, false, false, false);
		setCriticalDamage(100);
		setWeight(30);
		setDurability(200);
		setSoulValue(50);
	}

}
