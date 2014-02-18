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


/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public enum Items {
	HOMEWARDBONE("item.dsc:homewardbone.name");
	
	private final String itemName;
	
	Items(String itemName) {
		this.itemName = itemName;
	}
	
	public String unlocal() {
		return itemName;
	}
}
