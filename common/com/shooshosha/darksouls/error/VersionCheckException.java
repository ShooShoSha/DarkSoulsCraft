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
	private static final long serialVersionUID = 2876255270502903204L; //Generate on file create.

	/**
	 * 
	 */
	public VersionCheckException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public VersionCheckException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public VersionCheckException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public VersionCheckException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public VersionCheckException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
