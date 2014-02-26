package com.shooshosha.darksouls.library;

import java.util.Properties;

public final class Version {
	private static String major;
	private static String minor;
	private static String rev;
	private static String build;
	private static String mc;
	
	public static void initialize(Properties properties) {
		major = properties.getProperty("");
		minor = properties.getProperty("");
		rev = properties.getProperty("");
		build = properties.getProperty("");
		mc = properties.getProperty("");
	}
	
	public static String getString() {
		return String.format("%s.%s.%s:%s", major, minor, rev, build);
	}
	
	public static String getMC() {
		return mc;
	}
}
