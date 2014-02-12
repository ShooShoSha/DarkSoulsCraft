/**
 * DarkSoulsCraft
 * 
 * Message.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
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
