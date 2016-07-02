package com.shooshosha.darksouls.item.equipment.weapon.crossbow;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;
import com.shooshosha.darksouls.item.equipment.weapon.Projectile;

import java.util.HashSet;
import java.util.Set;

abstract class Crossbows extends DSCItemWeapon implements Projectile {
    private static Set<Crossbows> instances = new HashSet<Crossbows>();
    private int range;

    protected Crossbows(String unlocalName) {
        super("crossbows." + unlocalName);
        instances.add(this);
    }

    public static Set<Crossbows> getInstances() {
        return instances;
    }

    public final void setRange(int range) {
        this.range = range;
    }

    public final int getRange() {
        return range;
    }
}
