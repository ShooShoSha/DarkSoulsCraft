package com.shooshosha.darksouls.item.equipment.weapon.shield;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

/**
 * @author shooshosha
 */
public final class Buckler extends Shields {
    public Buckler() {
        super("buckler");
        setShieldSize(Size.SMALL);
        setAttackRatings(55, 0, 0, 0, 0);
        setDamageType(Type.STRIKE);
        setDurability(140);
        setWeight(1.5);
        setStatsRequirements(7, 13, 0 , 0);
        setStatsScaling(Bonus.D, Bonus.Z, Bonus.Z, Bonus.Z);
        setReductionRatings(0.76, 0.32, 0.65, 0.53);
        setStability(40);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
    }
}
