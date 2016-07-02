package com.shooshosha.darksouls.item.equipment.weapon.crossbow;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class HeavyCrossbow extends Crossbows {
	public HeavyCrossbow() {
        super("heavycrossbow");
        setAttackRatings(55, 0, 0, 0, 100);
        setDamageType(Type.PIERCE);
        setDurability(150);
        setWeight(5.0);
        setStatsRequirements(14, 8, 0, 0);
        setStatsScaling(Bonus.Z, Bonus.Z, Bonus.Z, Bonus.Z);
        setReductionRatings(0.45, 0.1, 0.3, 0.3);
        setStability(26);
        setSoulValue(50);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
        setRange(50);
    }
}
