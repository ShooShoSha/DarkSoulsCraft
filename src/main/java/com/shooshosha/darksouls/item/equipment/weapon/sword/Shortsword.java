package com.shooshosha.darksouls.item.equipment.weapon.sword;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public final class Shortsword extends Swords {

    public Shortsword() {
        super("shortsword");
        setAttackRatings(78, 0, 0, 0, 100);
        //TODO Add additional damage type PIERCE
        setDamageType(Type.NORMAL);
        setDurability(200);
        setWeight(2.0);
        setStatsRequirements(8, 10, 0, 0);
        setStatsScaling(Bonus.C, Bonus.C, Bonus.Z, Bonus.Z);
        setReductionRatings(0.5, 0.1, 0.35, 0.35);
        setStability(32);
        setSoulValue(50);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
    }
}
