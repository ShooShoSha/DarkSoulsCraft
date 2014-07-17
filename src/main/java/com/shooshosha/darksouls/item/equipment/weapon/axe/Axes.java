package com.shooshosha.darksouls.item.equipment.weapon.axe;


import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Axes extends DSCItemWeapon {
    private static Set<Axes> axes = new HashSet<Axes>();

    protected Axes(String unlocalName) {
        super("axes." + unlocalName);
        axes.add(this);
    }

    public static Set<Axes> getAxes() {
        return axes;
    }
}
