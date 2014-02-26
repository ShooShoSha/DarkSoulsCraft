package com.shooshosha.darksouls.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

public abstract class DSCItemTool extends ItemTool {

	protected DSCItemTool(float efficiencyOnProperMaterial, ToolMaterial toolMaterial, Set<Block> blocksEffectiveAgainst) {
		super(efficiencyOnProperMaterial, toolMaterial, blocksEffectiveAgainst);
	}

}
