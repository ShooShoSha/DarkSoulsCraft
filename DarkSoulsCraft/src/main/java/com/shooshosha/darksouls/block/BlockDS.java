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

import com.shooshosha.darksouls.DarkSoulsCraft;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public abstract class BlockDS extends BlockContainer {

	/**
	 * @param par1
	 * @param par2Material
	 */
	public BlockDS(Material material) {
		super(material);
		this.setCreativeTab(DarkSoulsCraft.tabsDSC);
	}

}
