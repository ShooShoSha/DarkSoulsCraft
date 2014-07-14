package com.shooshosha.darksouls.item.weapon.axe;

import com.shooshosha.darksouls.item.weapon.Bonus;
import com.shooshosha.darksouls.item.weapon.DSCItemWeapon;

public class BattleAxe extends DSCItemWeapon implements Axes {
	public BattleAxe() {
		super();
		setUnlocalizedName("battleaxe");
		setTextureName(getUnlocalizedName());
		setBaseStatuses();
	}
	
	protected void setBaseStatuses() {
		setDamages(95, 0, 0, 0);
		setReductions(55, 10, 40, 40);
		setRequirements(10, 0, 0, 0);
		setBonuses(Bonus.C, Bonus.D, Bonus.Z, Bonus.Z);
		setTypes(false, true, false, false);
		setCriticalDamage(100);
		setWeight(40);
		setDurability(250);
		setSoulValue(0);
		setStability(36);
	}

}
