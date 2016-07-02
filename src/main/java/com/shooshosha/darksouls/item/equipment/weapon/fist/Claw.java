package com.shooshosha.darksouls.item.equipment.weapon.fist;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class Claw extends Fists {
    public Claw() {
        super("claw");
        setAttackRatings(72, 0, 0, 0, 100);
        setDamageType(Type.SLASH);
        setDurability(150);
        setWeight(1.0);
        setStatsRequirements(6, 14, 0, 0);
        setStatsScaling(Bonus.E, Bonus.B, Bonus.Z, Bonus.Z);
        setReductionRatings(0.4, 0.1, 0.3, 0.3);
        setStability(0);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(300, 0, 0, 0, 0, 0);
    }
}
