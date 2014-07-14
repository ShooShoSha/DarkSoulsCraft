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

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

import com.shooshosha.darksouls.creativetab.DSCCreativeTab;
import com.shooshosha.darksouls.library.Reference;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public abstract class Proxy {
	public static CreativeTabs DSCtab = new DSCCreativeTab(Reference.MOD_ID);

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
