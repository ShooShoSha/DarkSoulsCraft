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

import net.minecraft.creativetab.CreativeTabs;

import com.shooshosha.darksouls.creativetab.CreativeTabDSC;
import com.shooshosha.darksouls.helper.FingerprintHelper;
import com.shooshosha.darksouls.helper.PreInitializer;
import com.shooshosha.darksouls.lib.Reference;
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
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsDSC = new CreativeTabDSC(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@EventHandler public void invalidFingerprint(FMLFingerprintViolationEvent event) {
		FingerprintHelper.advise();
	}
		
	@EventHandler public void preInit(FMLPreInitializationEvent event) {
		PreInitializer.handle(event);
	}
	@EventHandler public void Init(FMLInitializationEvent event) {
		
	}
	@EventHandler public void postInit(FMLPostInitializationEvent event) {
		
	}
}
