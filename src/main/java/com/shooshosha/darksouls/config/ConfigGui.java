/*
 * Copyright 2014. Kevin "shooshosha" O'Brien (shooshosha@gmail.com) License: LGPLv3 or later
 *
 * This file is part of DarkSoulsCraft.
 *
 * DarkSoulsCraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * DarkSoulsCraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DarkSoulsCraft.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.shooshosha.darksouls.config;

import com.shooshosha.darksouls.DarkSoulsCraft;
import cpw.mods.fml.client.config.DummyConfigElement.DummyCategoryElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shooshosha
 */
public class ConfigGui extends GuiConfig {
    public static final String FACTORY = "com.shooshosha.darksouls.client.gui.GuiFactory";

    public ConfigGui(GuiScreen guiScreen) {
        super(guiScreen, getConfigElements(), DarkSoulsCraft.ID, false, false, I18n.format("darksouls.option"));
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add(new DummyCategoryElement(ConfigGeneral.CATEGORY, ConfigGeneral.LOCALE, ConfigGeneral.class));
        list.add(new DummyCategoryElement(ConfigVersion.CATEGORY, ConfigVersion.LOCALE, ConfigVersion.class));
        return list;
    }
}
