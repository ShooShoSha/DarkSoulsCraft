/*
 * Copyright 2014. Kevin O'Brien (shooshosha@gmail.com) License: LGPLv3 or later
 *
 * This file is part of DarkSoulsCraft.
 *
 * DarkSoulsCraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * DarkSoulsCraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DarkSoulsCraft.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.shooshosha.darksouls.item.equipment.weapon.whip;

import com.shooshosha.darksouls.item.equipment.Bonus;
import com.shooshosha.darksouls.item.equipment.Type;
import com.shooshosha.darksouls.item.equipment.Upgrade;

/**
 * @author shooshosha
 */
public final class GuardianTail extends Whips {
    public GuardianTail() {
        super("guardiantail");
        setAttackRatings(84, 0, 0, 0, 100);
        setDamageType(Type.NORMAL);
        setDurability(250);
        setWeight(5);
        setStatsRequirements(15, 10, 0, 0);
        setStatsScaling(Bonus.Z, Bonus.C, Bonus.Z, Bonus.Z);
        setReductionRatings(0.3, 0.1, 0.2, 0.2);
        setStability(16);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 300, 0, 0, 0, 0);
    }
    //Can bypass shield for half damage
}
