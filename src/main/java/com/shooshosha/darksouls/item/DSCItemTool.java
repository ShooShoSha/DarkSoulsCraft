package com.shooshosha.darksouls.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

import java.util.Set;

public abstract class DSCItemTool extends ItemTool {

	protected DSCItemTool(float efficiencyOnProperMaterial, ToolMaterial toolMaterial, Set<Block> blocksEffectiveAgainst) {
		super(efficiencyOnProperMaterial, toolMaterial, blocksEffectiveAgainst);
	}

}
