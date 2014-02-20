package com.shooshosha.darksouls.item.weapon;

import net.minecraft.item.Item;

import com.shooshosha.darksouls.item.DSCItem;
import com.shooshosha.darksouls.lib.Reference;

public abstract class Weapon extends DSCItem {
	private int physicalDamage;
	
	public Weapon() {
		super();
		setMaxStackSize(1);
	}
	
	@Override
	public Item setUnlocalizedName(String unlocalName) {
		return super.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
	}
	
	public int getPhysicalDamage() {
		return physicalDamage;
	}
	
	public void setPhysicalDamage(int physicalDamage) {
		this.physicalDamage = physicalDamage;
	}
}
