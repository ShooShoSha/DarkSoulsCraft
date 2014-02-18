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

import com.shooshosha.darksouls.lib.BlockIds;
import com.shooshosha.darksouls.lib.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public class Bonfire extends BlockDS {

	/**
	 * @param id
	 * @param material
	 */
	public Bonfire() {
		super(Material.fire);
		this.setHardness(5F);
		this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
	}
	
	@Override
	public String getUnlocalizedName() {
		StringBuilder unlocalizedName = new StringBuilder();
		
		unlocalizedName.append("tile.");
		unlocalizedName.append(Reference.RESOURCE_PREFIX);
		unlocalizedName.append(BlockIds.BONFIRE_NAME);
		
		return unlocalizedName.toString();
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO tile fun time
		return null;
	}

}
