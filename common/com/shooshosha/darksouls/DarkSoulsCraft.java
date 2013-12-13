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

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.shooshosha.darksouls.core.helper.ConfigurationHelper;
import com.shooshosha.darksouls.core.helper.FingerprintHelper;
import com.shooshosha.darksouls.core.helper.LogHelper;
import com.shooshosha.darksouls.core.helper.ItemsHelper;
import com.shooshosha.darksouls.core.helper.VersionHelper;
import com.shooshosha.darksouls.core.proxy.CommonProxy;
import com.shooshosha.darksouls.creativetab.CreativeTabDSC;
import com.shooshosha.darksouls.lib.Reference;

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
		//Log error version of Dark Souls Craft used was changed or corrupted
		FingerprintHelper.advise();
	}
		
	@EventHandler public void preInit(FMLPreInitializationEvent event) {
		//Initialize custom logger
		LogHelper.init();
		
		//Initialize the configuration
		ConfigurationHelper.init(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.MOD_ID);
		
		//Check version
		VersionHelper.execute();
		
		//Initialize items
		ItemsHelper.init();
		
	}
	@EventHandler public void Init(FMLInitializationEvent event) {
		
	}
	@EventHandler public void postInit(FMLPostInitializationEvent event) {
		
	}
}
