/**
 * DarkSoulsCraft
 * 
 * DarkSoulsCraftMod.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.shooshosha.darksouls.core.proxy.CommonProxy;
import com.shooshosha.darksouls.lib.Reference;
import com.shooshosha.darksouls.lib.Version;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
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
	@Instance
	public static DarkSoulsCraft instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static CommonProxy proxy;
	
	@EventHandler public void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler public void Init(FMLInitializationEvent event) {
		
	}
	@EventHandler public void postInit(FMLPostInitializationEvent event) {
		
	}
}
