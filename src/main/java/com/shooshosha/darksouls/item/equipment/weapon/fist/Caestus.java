package com.shooshosha.darksouls.item.equipment.weapon.fist;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

public class Caestus extends Fists {
    public Caestus() {
        super("caestus");
        setAttackRatings(66, 0, 0, 0, 100);
        setDamageType(Type.STRIKE);
        setDurability(300);
        setWeight(0.5);
        setStatsRequirements(5, 8, 0, 0);
        setStatsScaling(Bonus.C, Bonus.C, Bonus.Z, Bonus.Z);
        setReductionRatings(0, 0, 0, 0);
        setStability(0);
        setSoulValue(50);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
    }
}
