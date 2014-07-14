/**
 * DarkSoulsCraft
 * 
 * Reference.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.library;

import com.shooshosha.darksouls.proxy.ClientProxy;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 *
 */
public class Reference {
	
	//VERSION control constants
	public static final int VERSION_CHECK_ATTEMPTS = 3;
	public static final long VERSION_RETRY = 10000; //Time in milliseconds before attempting a retry
	public static final String VERSION_AUTHORITY_LOCATION = 
			"https://raw.github.com/ShooShoSha/DarkSoulsCraft/master/version.xml";
	
	//Object id offset constant
	public static final int ID_RANGE_CORRECTION = 256;
	
	//Localizations prefixes
	public static final String RESOURCE_PREFIX = MOD_ID + ":";
	public static final String ITEM_PREFIX = "item." + RESOURCE_PREFIX;
	public static final String BLOCK_PREFIX = "block." + RESOURCE_PREFIX;
	public static final String WEAPON_PREFIX = "weapon." + RESOURCE_PREFIX;
	
	public static final boolean isNegative(int candidate) {
		return candidate < 0;
	}
	
	public static final boolean isPercent(int candidate) {
		return 0 <= candidate && candidate <= 100;
	}
}
