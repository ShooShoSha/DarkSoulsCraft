/**
 * Copyright 2013 Kevin O'Brien (shooshosha@gmail.com) (License: LGPLv3 or later)
 *
 * This file is part of Dark Souls Craft.
 *
 * Dark Souls Craft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * Dark Souls Craft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Dark Souls Craft.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.shooshosha.darksouls.block;

import com.shooshosha.darksouls.DarkSoulsCraft;
import com.shooshosha.darksouls.proxy.Proxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.shooshosha.darksouls.library.Registrable;
import com.shooshosha.darksouls.proxy.CommonProxy;

/**
 * @author shooshosha
 * @date Dec 13, 2013
 *
 */
public class DSCBlock extends Block implements Registrable {
	public static final String localePrefix = "block." + DarkSoulsCraft.LOCALE;

	public DSCBlock(Material material) {
		super(material);
		this.setCreativeTab(Proxy.DSCtab);
	}

	@Override
	public Block setBlockName(String unlocal) {
		super.setBlockName(Reference.RESOURCE_PREFIX + unlocal);
	}

    @Override
    public void setUnlocalNameAs(String unlocalName) {

    }

    @Override
	public void setTextureResource() {
		
	}

	@Override
	public void setIcon(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + getUnlocalizedName());
	}
}
