package com.shooshosha.darksouls.item.equipment.weapon.dagger;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Daggers extends DSCItemWeapon {
    private static Set<Daggers> instances = new HashSet<Daggers>();

    protected Daggers(String unlocalName) {
        super("daggers." + unlocalName);
        instances.add(this);
    }

    public static Set<Daggers> getInstances() {
        return instances;
    }
}
