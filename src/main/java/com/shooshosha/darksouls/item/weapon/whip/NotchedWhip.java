package com.shooshosha.darksouls.item.weapon.whip;

import com.shooshosha.darksouls.item.weapon.Bonus;

public class NotchedWhip extends Whips {
	
	public NotchedWhip() {
		super();
		setUnlocalizedName("notchedwhip");
		setTextureName(getUnlocalizedName());
	}

	@Override
	protected void setBaseStatuses() {
		setDamages(76, 0, 0, 0);
		setTypes(true, false, false, false);
		setCriticalDamage(100);
		setDurability(200);
		setWeight(20);
		setRequirements(8, 16, 0, 0);
		setBonuses(Bonus.Z, Bonus.B, Bonus.Z, Bonus.Z);
		setStability(16);
		setAuxiliaryEffects(300, 0, 0, 0, 0);
	}

}
