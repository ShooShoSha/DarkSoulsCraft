package com.shooshosha.darksouls.item.equipment.weapon.hammer;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class Club extends Hammers {
	public Club() {
        super("club");
        setAttackRatings(87, 0, 0, 0, 100);
        setDamageType(Type.STRIKE);
        setDurability(250);
        setWeight(3.0);
        setStatsRequirements(10, 0, 0, 0);
        setStatsScaling(Bonus.A, Bonus.Z, Bonus.Z, Bonus.Z);
        setReductionRatings(0.45, 0.1, 0.3, 0.3);
        setStability(30);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
	}
}
