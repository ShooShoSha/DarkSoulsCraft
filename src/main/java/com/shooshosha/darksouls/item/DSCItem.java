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

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.shooshosha.darksouls.library.Registrable;
import com.shooshosha.darksouls.proxy.CommonProxy;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class DSCItem extends Item implements Registrable {
	public DSCItem() {
		super();
		this.maxStackSize = 64;
		this.setNoRepair();
		this.setCreativeTab(CommonProxy.DSCtab);
	}

	@Override
	public void setName(String unlocal) {
		super.setUnlocalizedName(unlocal);
	}

	@Override
	public void setTextureResource() {
		super.setTextureName(getUnlocalizedName());
	}

	@Override
	public void setIcon(IIconRegister iconRegsiter) {
		// TODO Auto-generated method stub
		
	}
}
