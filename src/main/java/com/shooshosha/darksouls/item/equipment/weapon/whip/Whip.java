package com.shooshosha.darksouls.item.equipment.weapon.whip;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public class Whip extends Whips {
	
	public Whip() {
        super("whip");
        setAttackRatings(80, 0, 0, 0, 100);
        setDamageType(Type.NORMAL);
        setDurability(200);
        setWeight(1.5);
        setStatsRequirements(7,14,0,0);
        setStatsScaling(Bonus.Z, Bonus.B, Bonus.Z, Bonus.Z);
        setReductionRatings(0.3, 0.1, 0.2, 0.2);
        setStability(16);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
	}
}
