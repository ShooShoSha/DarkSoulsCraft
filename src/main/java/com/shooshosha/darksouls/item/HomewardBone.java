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



/**
 * @author shooshosha
 * @date Dec 11, 2013
 *
 */
public class HomewardBone extends DSCItem {
	
	public HomewardBone() {
		super();
		setUnlocalizedName("homewardbone");
		setTextureName(getUnlocalizedName());
		maxStackSize = 99; //This probably won't work
	}
}
