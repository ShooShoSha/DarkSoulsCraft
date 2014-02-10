/**
 * DarkSoulsCraft
 * 
 * FingerprintHelper.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import com.shooshosha.darksouls.error.Error;
import com.shooshosha.darksouls.lib.Reference;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class FingerprintHelper {
	public static void advise() {
		if(Reference.FINGERPRINT.equals("@FINGERPRINT@")) {
			LogHelper.warning(Error.Fingerprint.NONE.getMessage(), Reference.MOD_NAME);
		} else {
			LogHelper.severe(Error.Fingerprint.INVALID.getMessage(), Reference.MOD_NAME);
		}
	}
}
