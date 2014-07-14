package com.shooshosha.darksouls.item.equipment;

public enum Bonus {
	S(7),
	A(6),
	B(5),
	C(4),
	D(3),
	E(2),
	Z(1);
	
	private final int scale;
	
	Bonus(int scale) {
		this.scale = scale;
	}
	
	public int scale() {
		return scale;
	}
}
