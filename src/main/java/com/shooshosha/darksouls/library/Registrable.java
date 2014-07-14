package com.shooshosha.darksouls.library;

import net.minecraft.client.renderer.texture.IIconRegister;

public interface Registrable {
	void setUnlocalNameAs(String unlocalName);
	void setTextureResource();
	void setIcon(IIconRegister iconRegsiter);
}
