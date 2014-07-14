package com.shooshosha.darksouls.item.equipment.weapon.whip;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public class NotchedWhip extends Whips {
	
	public NotchedWhip() {
        super("notchedwhip");
        setAttackRatings(76, 0, 0, 0, 100);
        setDamageType(Type.NORMAL);
        setDurability(200);
        setWeight(2);
        setStatsRequirements(8,16,0,0);
        setStatsScaling(Bonus.Z, Bonus.B, Bonus.Z, Bonus.Z);
        setReductionRatings(0.3, 0.1, 0.2, 0.2);
        setStability(16);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(300, 0, 0, 0, 0, 0);
	}
}
