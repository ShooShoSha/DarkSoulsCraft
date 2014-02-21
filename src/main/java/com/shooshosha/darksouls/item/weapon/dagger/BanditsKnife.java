package com.shooshosha.darksouls.item.weapon.dagger;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class BanditsKnife extends Daggers {
	public BanditsKnife() {
		super();
		setUnlocalizedName("banditsknife");
		setTextureName(getUnlocalizedName());
		setAuxiliaryEffects(300,0,0,0,0);
	}
	
	@Override
	protected void setBaseStatuses() {
		setDamages(56, 0, 0, 0);
		setReductions(45, 10, 30, 30);
		setRequirements(6, 12, 0, 0);
		setBonuses(Bonus.E, Bonus.B, Bonus.Z, Bonus.Z);
		setTypes(false, false, true, false);
		setCriticalDamage(147);
		setWeight(10);
		setDurability(200);
		setSoulValue(50);
		setStability(26);
	}

}
