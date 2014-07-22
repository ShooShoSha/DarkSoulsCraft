package com.shooshosha.darksouls.item.equipment.weapon.spear;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class Pike extends Spears {
	
	public Pike() {
        super("pike");
        setAttackRatings(86, 0, 0, 0, 100);
        setDamageType(Type.PIERCE);
        setDurability(180);
        setWeight(10.0);
        setStatsRequirements(24, 10, 0, 0);
        setStatsScaling(Bonus.D, Bonus.C, Bonus.Z, Bonus.Z);
        setReductionRatings(0.4, 0.1, 0.3, 0.3);
        setStability(26);
        setSoulValue(50);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
	}
}
