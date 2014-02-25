/**
 * DarkSoulsCraft
 * 
 * Localize.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.language;

import net.minecraft.util.StatCollector;

/**
 * @author shooshosha
 * @date Feb 3, 2014
 *
 */
public class Localize {
	private static String localizedMessage;
	
	/*
	 * This is handled by another system within Minecraft itself.
	 */
	@Deprecated
	public static String message(String message, Object... localizables) {
		if(localizables.length == 0) {
			localizedMessage = StatCollector.translateToLocal(message);
		} else if (localizables.length > 0) {
			localizedMessage = StatCollector.translateToLocalFormatted(message, (Object[])localizables);
		} else {
			throw new IllegalArgumentException();
		}
		return localizedMessage;
	}

}