/**
 * DarkSoulsCraft
 * 
 * FingerprintHelper.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.event;

import com.shooshosha.darksouls.error.Error;
import com.shooshosha.darksouls.helper.LogHelper;
import com.shooshosha.darksouls.lib.Reference;

import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class Fingerprint {
	public static void handle(FMLFingerprintViolationEvent event) {
		if(Reference.FINGERPRINT.equals("@FINGERPRINT@")) {
			LogHelper.warning(Error.Fingerprint.NONE.getMessage(), Reference.MOD_NAME);
		} else {
			LogHelper.severe(Error.Fingerprint.INVALID.getMessage(), Reference.MOD_NAME);
		}
	}
}
