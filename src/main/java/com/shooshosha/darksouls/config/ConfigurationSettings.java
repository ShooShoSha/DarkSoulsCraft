/**
 * Copyright 2013 Kevin O'Brien (shooshosha@gmail.com) (License: LGPLv3 or later)
 *
 * This file is part of Dark Souls Craft.
 *
 * Dark Souls Craft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * Dark Souls Craft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Dark Souls Craft.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.shooshosha.darksouls.config;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public class ConfigurationSettings {
	//Version check related settings
	public static boolean VERSION_RESULT;
	public static final String VERSION_RESULT_NAME = "version_check.results";
	public static final boolean VERSION_RESULT_DEFAULT = true;
	
	public static String VERSION_DISCOVERED;
	public static final String VERSION_DISCOVERED_NAME = "version_check.discovered";
	public static final String VERSION_DISCOVERED_DEFAULT = "";
	
	public static String VERSION_TYPE;
	public static final String VERSION_TYPE_NAME = "version_check.type";
	public static final String VERSION_TYPE_DEFAULT = "";
}
