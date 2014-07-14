package com.shooshosha.darksouls.item.equipment.weapon.axe;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;
import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

public class HandAxe extends Axes {
	public HandAxe() {
		super("handaxe");
        setAttackRatings(80, 0, 0, 0, 100);
        setDamageType(Type.NORMAL);
        setDurability(250);
        setWeight(2.0);
        setStatsRequirements(8, 8, 0, 0);
        setStatsScaling(Bonus.C, Bonus.D, Bonus.Z, Bonus.Z);
        setReductionRatings(0.55, 0.1, 0.4, 0.4);
        setStability(36);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
	}
}
