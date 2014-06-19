/**
 * Copyright 2013 Kevin O'Brien (shooshosha@gmail.com) (License: LGPLv3 or later)
 *
 * This file is part of Dark Souls Craft.
 *
 * Dark Souls Craft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * Dark Souls Craft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Dark Souls Craft.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.shooshosha.darksouls;

import com.shooshosha.darksouls.event.Fingerprint;
import com.shooshosha.darksouls.event.Initializer;
import com.shooshosha.darksouls.event.PostInitializer;
import com.shooshosha.darksouls.event.PreInitializer;
import com.shooshosha.darksouls.library.Reference;
import com.shooshosha.darksouls.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 * 
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, dependencies = Reference.MOD_DEPENDENCIES)
public class DarkSoulsCraft {
	@Instance(Reference.MOD_ID)
	public static DarkSoulsCraft instance;

	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static CommonProxy proxy;

	@EventHandler
	public void invalidFingerprint(FMLFingerprintViolationEvent event) {
		Fingerprint.handle(event);
	}

	@EventHandler
	public void Pre(FMLPreInitializationEvent event) {
		PreInitializer.handle(event);
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		Initializer.handle(event);
	}

	@EventHandler
	public void Post(FMLPostInitializationEvent event) {
		PostInitializer.handle(event);
	}
}
