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

/**
 * DarkSoulsCraft
 *
 * CommonProxy.java
 *
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.proxy;

import com.shooshosha.darksouls.DarkSoulsCraft;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.creativetab.CreativeTabs;

import com.shooshosha.darksouls.creativetab.DSCCreativeTab;

/**
 * @author shooshosha
 */
public abstract class Proxy {
    public static final String CLIENT = "com.shooshosha.darksouls.proxy.Client";
    public static final String SERVER = "com.shooshosha.darksouls.proxy.Server";

    public static CreativeTabs DSCtab = new DSCCreativeTab(DarkSoulsCraft.ID);

    @EventHandler
    public void onTampered(FMLFingerprintViolationEvent event) {

    }

    @EventHandler
    public void sendMessages(FMLInterModComms event) {

    }

    @EventHandler
    public void receiveMessages(FMLInterModComms.IMCEvent event) {

    }
}
