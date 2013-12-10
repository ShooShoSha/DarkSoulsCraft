/**
 * DarkSoulsCraft
 * 
 * GeneralConfiguration.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.config;

import net.minecraftforge.common.Configuration;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class GeneralConfiguration {
	private static Configuration generalConfiguration;
	
	public static void set(String categoryName, String propertyName, String newValue) {
		generalConfiguration.load();
		if(generalConfiguration.getCategoryNames().contains(categoryName)) {
			if(generalConfiguration.getCategory(categoryName).containsKey(propertyName)) {
				generalConfiguration.getCategory(categoryName).get(propertyName).set(newValue);
			}
		}
	}
}
