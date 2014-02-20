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

import com.shooshosha.darksouls.lib.Reference;
import com.shooshosha.darksouls.proxy.CommonProxy;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public abstract class DSCBlock extends Block {
	
	public DSCBlock(Material material) {
		super(material);
		this.setCreativeTab(CommonProxy.DSCtab);
	}
	
	@Override
	public Block setBlockName(String unlocalName) {
		return super.setBlockName(Reference.RESOURCE_PREFIX + unlocalName);
	}
}
