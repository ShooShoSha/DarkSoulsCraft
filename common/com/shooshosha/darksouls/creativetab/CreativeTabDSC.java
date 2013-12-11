/**
 * DarkSoulsCraft
 * 
 * CreativeTabDSC.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.creativetab;

import com.shooshosha.darksouls.lib.ItemIds;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class CreativeTabDSC extends CreativeTabs {

	/**
	 * @param tabID is the unique identifier for the tab
	 * @param tabLabel is the name given for the tab
	 */
	public CreativeTabDSC(int tabID, String tabLabel) {
		super(tabID, tabLabel);
	}
	
	/**
	 * @return item ID for its icon to display on the tab
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return ItemIds.HOMEWARD_BONE;
	}

}
