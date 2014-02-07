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

import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;
import com.shooshosha.darksouls.localize.Localize;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class FingerprintHelper {
	public static void advise() {
		if(Reference.FINGERPRINT.equals("@FINGERPRINT@")) {
			Log.warning(Localize.message(Messages.FINGERPRINT_NONE, Reference.MOD_ID));
		} else {
			Log.severe(Localize.message(Messages.FINGERPRINT_INVALID, Reference.MOD_ID));
		}
	}
}
