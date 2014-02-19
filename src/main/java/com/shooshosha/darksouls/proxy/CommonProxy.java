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

import net.minecraft.creativetab.CreativeTabs;

import com.shooshosha.darksouls.creativetab.DSCCreativeTab;
import com.shooshosha.darksouls.lib.Reference;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public class CommonProxy {
	public static CreativeTabs DSCtab = new DSCCreativeTab(Reference.MOD_ID);
}
