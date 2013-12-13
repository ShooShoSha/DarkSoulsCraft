/**
 * DarkSoulsCraft
 * 
 * ConfigurationHandler.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.core.helper;

import java.io.File;

import com.shooshosha.darksouls.config.GeneralConfiguration;
import com.shooshosha.darksouls.config.ItemConfiguration;

import net.minecraftforge.common.Configuration;

/**
 * @author shooshosha
 * @date Dec 10, 2013
 *
 */
public class ConfigurationHelper {
	public static Configuration configuration;
	
	public static void init(String configPath) {
		GeneralConfiguration.init(new File(configPath + "general.properties"));
		ItemConfiguration.init(new File(configPath + "item.properties"));
	}
}
