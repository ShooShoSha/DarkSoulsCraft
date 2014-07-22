package com.shooshosha.darksouls.item.equipment.weapon.dagger;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class BanditsKnife extends Daggers {
	public BanditsKnife() {
        super("banditsknife");
        setAttackRatings(56, 0, 0, 0, 147);
        setDamageType(Type.SLASH);
        setDurability(200);
        setWeight(1.0);
        setStatsRequirements(6, 12, 0, 0);
        setStatsScaling(Bonus.E, Bonus.B, Bonus.Z, Bonus.Z);
        setReductionRatings(0.45, 0.1, 0.3, 0.3);
        setStability(26);
        setSoulValue(50);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(300, 0, 0, 0, 0, 0);
	}

}
