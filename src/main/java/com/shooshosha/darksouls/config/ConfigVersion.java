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
package com.shooshosha.darksouls.config;

import com.pahimar.ee3.util.LogHelper;
import com.shooshosha.darksouls.helper.VersionHelper;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shooshosha
 */
public final class ConfigVersion extends CategoryEntry {
    public static final String CATEGORY = "version";
    public static final String LOCALE = ConfigHandler.LOCALE + CATEGORY + ".";

    private static boolean performCheck = true;
    private static String authorityURI = "http://shooshosha.github.io/DarkSoulsCraft/version.xml";
    private static int connectAttempts = 3;
    private static int retryDelay = 10000;

    public static void syncConfigurations(Configuration configuration) {
        LogHelper.trace("Syncing version configurations");

        List<String> propertyOrder = new ArrayList<String>();
        Property property;

        property = configuration.get(CATEGORY, "performCheck", performCheck);
        property.setLanguageKey(LOCALE + property.getName()).setRequiresMcRestart(true);
        property.comment = "Enable/Disable remote version checking";
        performCheck = property.getBoolean();
        propertyOrder.add(property.getName());

        property = configuration.get(CATEGORY, "authorityURI", authorityURI);
        property.setLanguageKey(LOCALE + property.getName()).setRequiresMcRestart(true);
        property.comment = "Remote version authority location";
        authorityURI = property.getString();
        propertyOrder.add(property.getName());

        property = configuration.get(CATEGORY, "connectAttempts", connectAttempts);
        property.setLanguageKey(LOCALE + property.getName()).setRequiresMcRestart(true);
        property.setMinValue(0).setMaxValue(5);
        property.comment = "Number of connection attempts to remote authority";
        connectAttempts = property.getInt();
        propertyOrder.add(property.getName());

        property = configuration.get(CATEGORY, "retryDelay", retryDelay);
        property.setLanguageKey(LOCALE + property.getName()).setRequiresMcRestart(true);
        property.setMinValue(100).setMaxValue(60000);
        property.comment = "Time delay (in milliseconds) between connection attempts";
        retryDelay = property.getInt();
        propertyOrder.add(property.getName());

        configuration.setCategoryPropertyOrder(CATEGORY, propertyOrder);
    }

    public ConfigVersion(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
        super(owningScreen, owningEntryList, configElement);
    }

    @Override
    protected GuiScreen buildChildScreen() {
        return new GuiConfig(this.owningScreen, (new ConfigElement(ConfigHandler.getConfiguration().getCategory(CATEGORY))).getChildElements(), this.owningScreen.modID, CATEGORY, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, ConfigGui.getAbridgedConfigPath(ConfigHandler.getConfiguration().toString()));
    }

    public static boolean performCheck() {
        return performCheck;
    }

    public static String getAuthorityURI() {
        return authorityURI;
    }

    public static int getConnectAttempts() {
        return connectAttempts;
    }

    public static int getRetryDelay() {
        return retryDelay;
    }
}
