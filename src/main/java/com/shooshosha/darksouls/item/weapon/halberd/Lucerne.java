package com.shooshosha.darksouls.item.weapon.halberd;

import com.shooshosha.darksouls.item.weapon.Bonus;

import com.shooshosha.darksouls.item.weapon.Upgrade;

public class Lucerne extends Halberds {
	
	public Lucerne() {
		super();
		setUnlocalizedName("lucerne");
		setTextureName(getUnlocalizedName());
		setBaseStatuses();
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(110, 0, 0, 0);
		setReductions(40, 10, 30, 30);
		setRequirements(15, 12, 0, 0);
		setBonuses(Bonus.D, Bonus.D, Bonus.Z, Bonus.Z);
		setTypes(false, false, false, true);
		setCritcalDamage(100);
		setWeight(55);
		setDurability(200);
		setSoulValue(0);
		setPath(Upgrade.NORMAL);
		setModifier(0);
	}

}