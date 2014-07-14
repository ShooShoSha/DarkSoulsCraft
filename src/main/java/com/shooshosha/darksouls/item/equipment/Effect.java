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
public class Effect {
    private int bleed;
    private int poison;
    private int holy;
    private int occult;
    private int curse;
    private int toxic;

    public Effect(int bleed, int poison, int holy, int occult, int curse, int toxic) {
        this.bleed = bleed;
        this.curse = curse;
        this.poison = poison;
        this.toxic = toxic;
        this.holy = holy;
        this.occult = occult;
    }

    public int getBleed() {
        return bleed;
    }

    public void setBleed(int bleed) {
        this.bleed = bleed;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    public int getToxic() {
        return toxic;
    }

    public void setToxic(int toxic) {
        this.toxic = toxic;
    }

    public int getHoly() {
        return holy;
    }

    public void setHoly(int holy) {
        this.holy = holy;
    }

    public int getOccult() {
        return occult;
    }

    public void setOccult(int occult) {
        this.occult = occult;
    }
}
