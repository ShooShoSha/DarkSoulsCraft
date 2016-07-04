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
    /**
     * The name of the mod.
     */
    public static final String NAME = "Dark Souls Craft";
    /**
     * Unique identifier for the mod.
     */
    public static final String ID = "darksouls";
    /**
     * Mod's current version.
     */
    public static final String VERSION = "${version}";
    /**
     * Signed signature of mod.
     */
    public static final String FINGERPRINT = "@FINGERPRINT@";
    /**
     * List of dependencies.
     */
    public static final String DEPENDENCIES = "";
    /**
     * Identifies namespace for assets.
     */
    public static final String LOCALE = ID + ".";

    /**
     * The singleton instance of this mod.
     */
    @Mod.Instance(ID)
    public static DarkSoulsCraft instance;

    /**
     * The proxy instance.
     */
    @SidedProxy(modId= ID, clientSide= Proxy.CLIENT, serverSide= Proxy.SERVER)
    public static Proxy proxy;

    /**
     * Event handler for mismatched fingerprint.
     * @param event
     */
    @Mod.EventHandler
    public void onTampered(FMLFingerprintViolationEvent event) {
        LogHelper.trace("Starting fingerprint violation handling");
        Fingerprint.handle(event);
        LogHelper.trace("Finished fingerprint violation handling");
    }

    /**
     * Event handler for instantiating objects.
     * @param event
     */
    @Mod.EventHandler
    public void preInitialize(FMLPreInitializationEvent event) {
        LogHelper.trace("Starting pre-initialization...");
        PreInitializer.handle(event);
        LogHelper.trace("Finished pre-initialization...");
    }

    /**
     * Event handler for registering objects and making requests.
     * @param event
     */
    @Mod.EventHandler
    public void onInitialize(FMLInitializationEvent event) {
        LogHelper.trace("Starting initialization...");
        Initializer.handle(event);
        LogHelper.trace("Finished initialization");
    }

    /**
     * Event handler to send messages to other mods.
     * @param event
     */
    @Mod.EventHandler
    public void sendMessages(FMLInterModComms event) {
        LogHelper.trace("Sending messages to other mods");
        Messenger.handle(event);
        LogHelper.trace("Sent messages to other mods");
    }

    /**
     * Event handler to receive messages sent by other mods.
     * @param event
     */
    @Mod.EventHandler
    public void receiveMessages(FMLInterModComms.IMCEvent event) {
        LogHelper.trace("Receiving message from other mod");
        Messenger.handle(event);
        LogHelper.trace("Received message from other mod");
    }

    /**
     * Event handler to perform cross-mod behaviours.
     * @param event
     */
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

    /**
     * Event handler before a server starts.
     * @param event
     */
    @Mod.EventHandler
    public void onStart(FMLServerStartingEvent event) {
        LogHelper.trace("Server starting initialization");

        LogHelper.trace("Server starting initialized");
    }

    /**
     * Event handler for when a server starts.
     * @param event
     */
    @Mod.EventHandler
    public void postStart(FMLServerStartedEvent event) {
        LogHelper.trace("Server started initialization");

        LogHelper.trace("Server started initialized");
    }

    /**
     * Event handler for when a server is about to shutdown.
     * @param event
     */
    @Mod.EventHandler
    public void onStop(FMLServerStoppingEvent event) {
        LogHelper.trace("Server stopping finalizing");

        LogHelper.trace("Server stopping finalized");
    }

    /**
     * Event handler for when a server has stopped.
     * @param event
     */
    @Mod.EventHandler
    public void postStop(FMLServerStoppedEvent event) {
        LogHelper.trace("Server stopped finalizing");

        LogHelper.trace("Server stopped finalized");
    }
}
