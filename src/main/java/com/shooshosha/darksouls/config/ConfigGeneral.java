/*
 * Copyright 2014. Kevin O'Brien (shooshosha@gmail.com) License: LGPLv3 or later
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


import com.pahimar.ee3.util.LogHelper;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;


/**
 * @author shooshosha
 */
public class ConfigGeneral extends GuiConfigEntries.CategoryEntry {
    public static final String CATEGORY = "general";
    public static final String LOCALE = ConfigHandler.LOCALE + CATEGORY;

    private static boolean configTest = false;

    public static void syncConfigurations() {
        LogHelper.trace("Syncing general configurations");

        List<String> propertyOrder = new ArrayList<String>();
        Configuration configuration = ConfigHandler.getConfiguration();
        Property property;

        property = configuration.get(CATEGORY, "configTest", configTest);
        property.setLanguageKey(LOCALE + "." + property.getName());
        configTest = property.getBoolean();
        propertyOrder.add(property.getName());

        configuration.setCategoryPropertyOrder(CATEGORY, propertyOrder);
    }

    public ConfigGeneral(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
        super(owningScreen, owningEntryList, configElement);
    }

    @Override
    protected GuiScreen buildChildScreen() {
        return new GuiConfig(this.owningScreen, (new ConfigElement(ConfigHandler.getConfiguration().getCategory(CATEGORY))).getChildElements(), this.owningScreen.modID, CATEGORY, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, ConfigGui.getAbridgedConfigPath(ConfigHandler.getConfiguration().toString()));
    }

    public static boolean getConfigTest() {
        return configTest;
    }
}
