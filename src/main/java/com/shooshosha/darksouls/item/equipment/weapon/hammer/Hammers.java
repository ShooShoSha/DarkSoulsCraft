package com.shooshosha.darksouls.item.equipment.weapon.hammer;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Hammers extends DSCItemWeapon {
    private static Set<Hammers> instances = new HashSet<Hammers>();

    protected Hammers(String unlocalName) {
        super("hammers." + unlocalName);
        instances.add(this);
    }

    public static Set<Hammers> getInstances() {
        return instances;
    }
}
