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
package com.shooshosha.darksouls;

import com.pahimar.ee3.util.LogHelper;
import com.shooshosha.darksouls.config.ConfigGui;
import com.shooshosha.darksouls.event.*;
import com.shooshosha.darksouls.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

/**
 * @author shooshosha
 */
@Mod(modid = DarkSoulsCraft.ID, name = DarkSoulsCraft.NAME, dependencies = DarkSoulsCraft.DEPENDENCIES, guiFactory = ConfigGui.FACTORY)
public class DarkSoulsCraft {
    public static final String NAME = "Dark Souls Craft";
    public static final String ID = "darksouls";
    public static final String VERSION = "${mod_version}";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String DEPENDENCIES = "";
    public static final String LOCALE = ID + ".";

    @Mod.Instance(ID)
    public static DarkSoulsCraft instance;

    @SidedProxy(modId= ID, clientSide= Proxy.CLIENT, serverSide= Proxy.SERVER)
    public static Proxy proxy;

    @Mod.EventHandler
    public void onTampered(FMLFingerprintViolationEvent event) {
        LogHelper.trace("Starting fingerprint violation handling");
        Fingerprint.handle(event);
        LogHelper.trace("Finished fingerprint violation handling");
    }

    @Mod.EventHandler
    public void preInitialize(FMLPreInitializationEvent event) {
        LogHelper.trace("Starting pre-initialization...");
        PreInitializer.handle(event);
        LogHelper.trace("Finished pre-initialization...");
    }

    @Mod.EventHandler
    public void onInitialize(FMLInitializationEvent event) {
        LogHelper.trace("Starting initialization...");
        Initializer.handle(event);
        LogHelper.trace("Finished initialization");
    }

    @Mod.EventHandler
    public void sendMessages(FMLInterModComms event) {
        LogHelper.trace("Sending messages to other mods");
        Messenger.handle(event);
        LogHelper.trace("Sent messages to other mods");
    }

    @Mod.EventHandler
    public void receiveMessages(FMLInterModComms.IMCEvent event) {
        LogHelper.trace("Receiving message from other mod");
        Messenger.handle(event);
        LogHelper.trace("Received message from other mod");
    }

    @Mod.EventHandler
    public void postInitialize(FMLPostInitializationEvent event) {
        LogHelper.trace("Starting post-initialization...");
        PostInitializer.handle(event);
        LogHelper.trace("Finished post-initialization");
    }

    @Mod.EventHandler
    public void preStart(FMLServerAboutToStartEvent event) {
        LogHelper.trace("Server about to start initialization");

        LogHelper.trace("Server about to start initialized");
    }

    @Mod.EventHandler
    public void onStart(FMLServerStartingEvent event) {
        LogHelper.trace("Server starting initialization");

        LogHelper.trace("Server starting initialized");
    }

    @Mod.EventHandler
    public void postStart(FMLServerStartedEvent event) {
        LogHelper.trace("Server started initialization");

        LogHelper.trace("Server started initialized");
    }

    @Mod.EventHandler
    public void onStop(FMLServerStoppingEvent event) {
        LogHelper.trace("Server stopping finalizing");

        LogHelper.trace("Server stopping finalized");
    }

    @Mod.EventHandler
    public void postStop(FMLServerStoppedEvent event) {
        LogHelper.trace("Server stopped finalizing");

        LogHelper.trace("Server stopped finalized");
    }
}
