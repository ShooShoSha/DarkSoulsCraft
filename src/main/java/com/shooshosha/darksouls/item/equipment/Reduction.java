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
public class Reduction {
    private double physical;
    private double magical;
    private double fire;
    private double lightning;

    public Reduction(double physical, double magical, double fire, double lightning) {
        this.physical = physical;
        this.magical = magical;
        this.fire = fire;
        this.lightning = lightning;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public double getMagical() {
        return magical;
    }

    public void setMagical(int magical) {
        this.magical = magical;
    }

    public double getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public double getLightning() {
        return lightning;
    }

    public void setLightning(int lightning) {
        this.lightning = lightning;
    }
}
