package com.shooshosha.darksouls.language;

public class Localization {
	private interface Localizable {
		String unlocal();
	}
	
	public enum Blocks implements Localizable {
		bonfire("dsc:bonfire");
		
		private final String unlocal;
		
		Blocks(String unlocal) {
			this.unlocal = unlocal;
		}
		
		@Override
		public String unlocal() {
			return unlocal;
		}
		
	}
	
	public enum Items implements Localizable{
		homewardbone("dsc:homewardbone"),
		halberd("dsc:halberd");
		
		private final String unlocal;
		
		Items(String unlocal) {
			this.unlocal = unlocal;
		}
		
		@Override
		public String unlocal() {
			return unlocal;
		}
		
		
	}
}
