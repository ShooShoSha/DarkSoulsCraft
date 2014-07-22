package com.shooshosha.darksouls.item.equipment.weapon.shield;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

/**
 * @author shooshosha
 */
public final class GrassCrest extends Shields {
    public GrassCrest() {
        super("grassCrest");
        setShieldSize(Size.NORMAL);
        setAttackRatings(62, 0, 0, 0, 0);
        setDamageType(Type.STRIKE);
        setDurability(200);
        setWeight(3.0);
        setStatsRequirements(10, 0, 0, 0);
        setStatsScaling(Bonus.D, Bonus.Z, Bonus.Z, Bonus.Z);
        setReductionRatings(0.95, 0.42, 0.7, 0.5);
        setStability(51);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
    }
}
