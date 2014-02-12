/**
 * DarkSoulsCraft
 * 
 * Items.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.item;

import com.shooshosha.darksouls.lib.Identifications;
import com.shooshosha.darksouls.localize.Localizations;

/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public enum Items implements Localizations, Identifications {
	HOMEWARDBONE("item.dsc:homewardbone.name", 25400);
	
	private final String itemName;
	private final int itemId;
	
	Items(String itemName, int itemId) {
		this.itemName = itemName;
		this.itemId = itemId;
	}
	
	@Override
	public String getName() {
		return itemName;
	}
	
	@Override
	public int getId() {
		return itemId;
	}
}
