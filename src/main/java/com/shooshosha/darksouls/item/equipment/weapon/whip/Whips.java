package com.shooshosha.darksouls.item.equipment.weapon.whip;

import com.shooshosha.darksouls.item.equipment.weapon.DSCItemWeapon;

import java.util.HashSet;
import java.util.Set;

abstract class Whips extends DSCItemWeapon {
    private static Set<Whips> instances = new HashSet<Whips>();

    //Cannot be parried
    //No critical attacks (backstabs, riposte, plunging)
    protected Whips(String unlocalName) {
        super("whips." + unlocalName);

    }

    public static Set<Whips> getInstances() {
        return instances;
    }
}
