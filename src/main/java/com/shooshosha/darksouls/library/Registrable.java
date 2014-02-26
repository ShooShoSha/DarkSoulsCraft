package com.shooshosha.darksouls.library;

import net.minecraft.client.renderer.texture.IIconRegister;

public interface Registrable {
	void setName(String unlocal);
	void setTextureResource();
	void setIcon(IIconRegister iconRegsiter);
}
