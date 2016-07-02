package com.shooshosha.darksouls.item.equipment.weapon.fist;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Fists extends DSCItemWeapon {
    private static Set<Fists> instances = new HashSet<Fists>();

    protected Fists(String unlocalName) {
        super("fists." + unlocalName);
        instances.add(this);
    }

    public static Set<Fists> getInstances() {
        return instances;
    }
}
