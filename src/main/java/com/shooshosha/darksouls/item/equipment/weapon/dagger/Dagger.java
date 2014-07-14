package com.shooshosha.darksouls.item.equipment.weapon.dagger;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public class Dagger extends Daggers {
	public Dagger() {
        super("dagger");
        setAttackRatings(56, 0, 0, 0, 131);
        setDamageType(Type.NORMAL);
        setDurability(200);
        setWeight(0.5);
        setStatsRequirements(5, 8, 0, 0);
        setStatsScaling(Bonus.E, Bonus.B, Bonus.Z, Bonus.Z);
        setReductionRatings(0.45, 0.1, 0.3, 0.3);
        setStability(26);
        setSoulValue(50);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
    }
}
