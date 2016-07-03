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

package com.shooshosha.darksouls.item.equipment;

/**
 * @author shooshosha
 */
public class Damage {
    private int physical;
    private int magical;
    private int fire;
    private int lightning;
    private int critical;

    public Damage(int physical, int magical, int fire, int lightning, int critical) {
        setPhysical(physical);
        setMagical(magical);
        setFire(fire);
        setLightning(lightning);
        setCritical(critical);
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        if (physical > -1) {
            this.physical = physical;
        }
    }

    public int getMagical() {
        return magical;
    }

    public void setMagical(int magical) {
        if (magical > -1) {
            this.magical = magical;
        }
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        if (fire > -1) {
            this.fire = fire;
        }
    }

    public int getLightning() {
        return lightning;
    }

    public void setLightning(int lightning) {
        if (lightning > -1) {
            this.lightning = lightning;
        }
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        if (critical > -1 && critical < 101) {
            this.critical = critical;
        }
    }
}
