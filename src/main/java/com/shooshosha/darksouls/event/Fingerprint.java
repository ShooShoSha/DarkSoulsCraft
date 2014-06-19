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
package com.shooshosha.darksouls.event;

import com.shooshosha.darksouls.error.Error;
import com.shooshosha.darksouls.library.Log;
import com.shooshosha.darksouls.library.Reference;

import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class Fingerprint {
	public static void handle(FMLFingerprintViolationEvent event) {
		if(Reference.FINGERPRINT.equals("@FINGERPRINT@")) {
			Log.warning(Error.Fingerprint.NONE.getMessage(), Reference.MOD_NAME);
		} else {
			Log.severe(Error.Fingerprint.INVALID.getMessage(), Reference.MOD_NAME);
		}
	}
}
