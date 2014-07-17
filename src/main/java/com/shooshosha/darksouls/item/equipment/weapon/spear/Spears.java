package com.shooshosha.darksouls.item.equipment.weapon.spear;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Spears extends DSCItemWeapon {
    private static Set<Spears> instances = new HashSet<Spears>();

    protected Spears(String unlocalName) {
        super("spears." + unlocalName);
        instances.add(this);
    }

    public static Set<Spears> getInstances() {
        return instances;
    }
}
