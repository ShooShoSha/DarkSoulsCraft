package com.shooshosha.darksouls.library;

public class Message {
	
	//Logger error messages
	public static final String LOGGER_NULL = "logger.dsc:null";
	
	public static enum Version {
		INITIALIZATION("Initiating remote version check against remote version authority, located at %s"),
		CURRENT("Currently using the most up to date version (%s) of %s for %s"),
		OUTDATED("A new version of %s exists (%s) for %s. Get it at %s");
		
		private final String message;
		
		Version(String message) {
			this.message = message;
		}
		
		public String getMessage() {
			return message;
		}
	}
}
