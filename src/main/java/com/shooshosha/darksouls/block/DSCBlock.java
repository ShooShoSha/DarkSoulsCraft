/**
 * DarkSoulsCraft
 * 
 * BlockDS.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.shooshosha.darksouls.library.Reference;
import com.shooshosha.darksouls.library.Registrable;
import com.shooshosha.darksouls.proxy.CommonProxy;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public class DSCBlock extends Block implements Registrable {
	
	public DSCBlock(Material material) {
		super(material);
		this.setCreativeTab(CommonProxy.DSCtab);
	}

	@Override
	public void setName(String unlocal) {
		super.setBlockName(Reference.RESOURCE_PREFIX + unlocal);
	}

	@Override
	public void setTextureResource() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIcon(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + getUnlocalizedName());
	}
}
