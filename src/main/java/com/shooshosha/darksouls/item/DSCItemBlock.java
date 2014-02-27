package com.shooshosha.darksouls.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public abstract class DSCItemBlock extends ItemBlock implements Registrable {

	public DSCItemBlock(Block p_i45328_1_) {
		super(p_i45328_1_);
	}
	
	public void setName(String unlocalName) {
		this.setUnlocalizedName(unlocalName);
	}
	

}
