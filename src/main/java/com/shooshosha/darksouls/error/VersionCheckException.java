/**
 * DarkSoulsCraft
 * 
 * VersionCheckException.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
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
