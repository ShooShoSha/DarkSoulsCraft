/**
 * Copyright 2013 Kevin O'Brien (shooshosha@gmail.com) (License: LGPLv3 or later)
 *
 * This file is part of Dark Souls Craft.
 *
 * Dark Souls Craft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * Dark Souls Craft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Dark Souls Craft.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.shooshosha.darksouls.error;

/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public final class Error {
	
	public static enum Fingerprint {
		NONE("This copy of %s is a development version and thus may be unstable, incomplete, or both"),
		INVALID("This copy of %s was modified from the original and may be harmful. Please re-download the original from an appropriate site");
		
		private final String message;
		
		Fingerprint(String message) {
			this.message = message;
		}
		
		public String getMessage() {
			return message;
		}
	}
}
