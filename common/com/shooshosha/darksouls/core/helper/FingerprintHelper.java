/**
 * DarkSoulsCraft
 * 
 * FingerprintHelper.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.core.helper;

import net.minecraft.util.StatCollector;

import com.shooshosha.darksouls.lib.Messages;
import com.shooshosha.darksouls.lib.Reference;

/**
 * @author shooshosha
 * @date Dec 4, 2013
 *
 */
public class FingerprintHelper {
	public static void advise() {
		if(Reference.FINGERPRINT.equals("@FINGERPRINT@")) {
			LogHelper.warning(StatCollector.translateToLocalFormatted(Messages.FINGERPRINT_NONE, Reference.MOD_NAME));
		} else {
			LogHelper.severe(StatCollector.translateToLocalFormatted(Messages.FINGERPRINT_INVALID, Reference.MOD_NAME));
		}
	}
}
