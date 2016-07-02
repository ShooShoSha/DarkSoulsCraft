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
import com.shooshosha.darksouls.DarkSoulsCraft;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * @author shooshosha
 */
public class ConfigHandler implements Runnable {
    public static final String LOCALE = DarkSoulsCraft.LOCALE + "option.category.";
    private static Configuration configuration;
    private static ConfigHandler configHandler = new ConfigHandler();

    private ConfigHandler() {
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    public static void handle(File configurationFile) throws InterruptedException {
        if (configHandler.configuration == null) {
            configHandler.configuration = new Configuration(configurationFile);
            new Thread(configHandler, configHandler.getClass().getSimpleName()).start();
        }
    }

    @Override
    public void run() {
        LogHelper.trace("Loading configurations");
        try {
            configuration.load();
            ConfigGeneral.syncConfigurations();
            ConfigVersion.syncConfigurations(configuration);
        } catch (RuntimeException loadConfigurationException) {
            LogHelper.warn("Loading configuration file encountered an error:%n%s", loadConfigurationException);
        } catch (Exception e) {
            LogHelper.error("Loading configuration file encountered an unexpected error:%n%s", e);
        } finally {
            if (configuration.hasChanged())
                configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(DarkSoulsCraft.ID)) {
            new Thread(configHandler, configHandler.getClass().getSimpleName()).start();
        }
    }
}
