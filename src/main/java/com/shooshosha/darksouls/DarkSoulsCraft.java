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
package com.shooshosha.darksouls;

import com.shooshosha.darksouls.event.Fingerprint;
import com.shooshosha.darksouls.event.Initializer;
import com.shooshosha.darksouls.event.PostInitializer;
import com.shooshosha.darksouls.event.PreInitializer;
import com.shooshosha.darksouls.proxy.Proxy;

import com.shooshosha.darksouls.proxy.Proxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 * 
 */
@Mod(modid = DarkSoulsCraft.ID, name = DarkSoulsCraft.NAME, dependencies = DarkSoulsCraft.DEPENDENCIES)
public class DarkSoulsCraft {
    public static final String NAME = "Dark Souls Craft";
    public static final String ID = "darksouls";
    public static final String VERSION = "@VERSION@";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String DEPENDENCIES = "";
    public static final String LOCALE = ID + ":";

	@Instance(ID)
	public static DarkSoulsCraft instance;

    @SidedProxy(modId = ID, clientSide = Proxy.CLIENT, serverSide = Proxy.SERVER)
    public static Proxy proxy;
}
