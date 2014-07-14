/**
 * DarkSoulsCraft
 * 
 * ItemDS.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.item;

import com.shooshosha.darksouls.DarkSoulsCraft;
import com.shooshosha.darksouls.proxy.Proxy;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class DSCItem extends Item {
    private static final String localePrefix = DarkSoulsCraft.LOCALE;

	public DSCItem(String unlocalName) {
		super();
        setUnlocalizedName(localePrefix + unlocalName);
        setTextureName(getUnlocalizedName());
		this.maxStackSize = 64;
		this.setNoRepair();
		this.setCreativeTab(Proxy.DSCtab);
	}
}
