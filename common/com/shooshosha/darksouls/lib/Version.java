/**
 * DarkSoulsCraft
 * 
 * Version.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.lib;

import java.util.Properties;

/**
 * @author shooshosha
 * @date Nov 26, 2013
 *
 */
public class Version {
	private static String major;
	private static String minor;
	private static String rev;
	private static String build;
	private static String mcversion;
	
	private void init(Properties properties) {
		if (properties != null) {
			major = properties.getProperty("DarkSoulsCraftMod.build.major.number");
			minor = properties.getProperty("DarkSoulsCraftMod.build.minor.number");
            rev = properties.getProperty("DarkSoulsCraftMod.build.revision.number");
            build = properties.getProperty("DarkSoulsCraftMod.build.number");
            mcversion = properties.getProperty("DarkSoulsCraftMod.build.mcversion");
        }
    }

    public static String fullVersionString()
    {
        return String.format("%s.%s.%s build %s", major, minor, rev, build);
	}
}
