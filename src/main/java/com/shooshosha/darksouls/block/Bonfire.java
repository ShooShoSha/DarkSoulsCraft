/**
 * DarkSoulsCraft
 * 
 * Bonfire.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.block;

import com.shooshosha.darksouls.language.Localization;

import net.minecraft.block.material.Material;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public class Bonfire extends DSCBlock {
	
	public Bonfire() {
		super(Material.fire);
		setBlockName(Localization.Blocks.bonfire.unlocal());
		this.setHardness(5F);
		this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
	}
}
