/**
 * DarkSoulsCraft
 * 
 * Blocks.java
 * 
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.block;

import com.shooshosha.darksouls.lib.Identifications;
import com.shooshosha.darksouls.localize.Localizations;

/**
 * @author shooshosha
 * @date Feb 10, 2014
 *
 */
public enum Blocks implements Localizations, Identifications {
	BONFIRE("block.dsc:bonfire.name", 950);
	
	private final String blockName;
	private final int blockId;
	
	Blocks(String blockName, int blockId) {
		this.blockName = blockName;
		this.blockId = blockId;
	}
	
	@Override
	public String getName() {
		return blockName;
	}
	
	public int getId() {
		return blockId;
	}

}
