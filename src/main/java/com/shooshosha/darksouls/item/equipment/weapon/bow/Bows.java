package com.shooshosha.darksouls.item.equipment.weapon.bow;


import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;
import com.shooshosha.darksouls.item.equipment.weapon.Projectile;
import net.minecraft.block.Block;

import java.util.HashSet;
import java.util.Set;

abstract class Bows extends DSCItemWeapon implements Projectile {
    private static Set<Bows> instances = new HashSet<Bows>();
    private int range;

    protected Bows(String unlocalName) {
        super("bows." + unlocalName);
        instances.add(this);
    }

    public static Set<Bows> getInstances() {
        return instances;
    }

    public final void setRange(int range) {
        this.range = range;
    }

    public final int getRange() {
        return range;
    }
}
