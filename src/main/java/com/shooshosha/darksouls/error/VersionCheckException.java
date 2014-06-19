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
 * @date Feb 6, 2014
 *
 */
public class VersionCheckException extends RuntimeException {
	private static final long serialVersionUID = 2876255270502903204L; //Generated on file create.

	public VersionCheckException() {
	}
	public VersionCheckException(String message) {
		super(message);
	}
	public VersionCheckException(Throwable cause) {
		super(cause);
	}
	public VersionCheckException(String message, Throwable cause) {
		super(message, cause);
	}
	public VersionCheckException(String message, Throwable cause, boolean enableSuppression, 
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
