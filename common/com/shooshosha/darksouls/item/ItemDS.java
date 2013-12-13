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
import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class ItemDS extends Item {

	/**
	 * @param id
	 */
	public ItemDS(int id) {
		super(id - Reference.ID_RANGE_CORRECTION);
		this.maxStackSize = 64;
		this.setNoRepair();
		this.setCreativeTab(DarkSoulsCraft.tabsDSC);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
