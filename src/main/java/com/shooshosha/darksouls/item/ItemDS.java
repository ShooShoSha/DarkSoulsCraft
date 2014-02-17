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

import net.minecraft.item.Item;

import com.shooshosha.darksouls.DarkSoulsCraft;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class ItemDS extends Item {

	/**
	 * @param id
	 */
	public ItemDS() {
		super();
		this.maxStackSize = 64;
		this.setNoRepair();
		this.setCreativeTab(DarkSoulsCraft.tabsDSC);
	}
	
	
}
