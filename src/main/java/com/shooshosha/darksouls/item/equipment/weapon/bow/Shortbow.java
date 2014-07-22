package com.shooshosha.darksouls.item.equipment.weapon.bow;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class Shortbow extends Bows {
	public Shortbow() {
        super("shortbow");
        setAttackRatings(31, 0, 0, 0, 100);
        setDamageType(Type.PIERCE);
        setDurability(100);
        setWeight(0.5);
        setStatsRequirements(7, 12, 0, 0);
        setStatsScaling(Bonus.D, Bonus.A, Bonus.Z, Bonus.Z);
        setReductionRatings(0.45, 0.1, 0.3, 0.3);
        setStability(26);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
        setRange(50);
    }
}
