package com.shooshosha.darksouls.item.equipment.weapon.hammer;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public class Mace extends Hammers {
	public Mace() {
        super("mace");
        setAttackRatings(91, 0, 0, 0, 100);
        setDamageType(Type.PIERCE);
        setDurability(250);
        setWeight(4.0);
        setStatsRequirements(12, 0, 0, 0);
        setStatsScaling(Bonus.B, Bonus.Z, Bonus.Z, Bonus.Z);
        setReductionRatings(0.45, 0.1, 0.3, 0.3);
        setStability(30);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
	}
}
