/**
 * DarkSoulsCraft
 * 
 * HomewardBone.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.item;

import com.shooshosha.darksouls.lib.ItemIds;
import com.shooshosha.darksouls.lib.Reference;

/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class HomewardBone extends ItemDS {

	/**
	 * @param id
	 */
	public HomewardBone(int id) {
		super(id);
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + ItemIds.HOMEWARD_BONE_NAME);
	}

}
