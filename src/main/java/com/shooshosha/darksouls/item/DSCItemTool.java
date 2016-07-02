package com.shooshosha.darksouls.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

import java.util.Set;

public abstract class DSCItemTool extends ItemTool {

	protected DSCItemTool(ToolMaterial toolMaterial, Set<Block> blocksEffectiveAgainst) {
		//super(efficiencyOnProperMaterial, toolMaterial, blocksEffectiveAgainst);
		super(toolMaterial, blocksEffectiveAgainst);
	}

}
