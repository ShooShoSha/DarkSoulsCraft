package com.shooshosha.darksouls.item.equipment.weapon.sword;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Swords extends DSCItemWeapon {
    private static Set<Swords> instances = new HashSet<Swords>();

    protected Swords(String unlocalName) {
        super("swords." + unlocalName);
        instances.add(this);
    }

    public static Set<Swords> getInstances() {
        return instances;
    }
}
