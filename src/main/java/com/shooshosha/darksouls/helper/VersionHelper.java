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

/**
 * DarkSoulsCraft
 *
 * VERSION.java
 *
 * @author shooshosha
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
package com.shooshosha.darksouls.helper;

import com.pahimar.ee3.util.LogHelper;
import com.shooshosha.darksouls.DarkSoulsCraft;
import com.shooshosha.darksouls.config.ConfigVersion;
import com.shooshosha.darksouls.error.VersionCheckException;
import cpw.mods.fml.common.Loader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 * @author shooshosha
 */
public class VersionHelper implements Runnable {
    private static URL remoteAuthorityLocation;
    private static InputStream remoteAuthorityConnection;
    private static Properties remoteAuthorityProperties;

    private static VersionHelper validator = new VersionHelper();
    private static String remoteVersionProperty;
    private static String remoteVersionNumber;
    private static String remoteUpdateLocation;


    public static void runCheck() throws InterruptedException {
        if (ConfigVersion.performCheck()) {
            LogHelper.trace("Checking version against remote authority at %s", ConfigVersion.getAuthorityURI());
            new Thread(validator, validator.getClass().getSimpleName()).start();
        }
    }

    @Override
    public void run() {
        try {
            checkVersion();
            LogHelper.trace("Using current version");
        } catch (VersionCheckException e) {
            LogHelper.warn(e.getMessage());
        } catch (InterruptedException e) {
            LogHelper.fatal("Version checking thread interrupted!");
        }
    }

    private static void checkVersion() throws VersionCheckException, InterruptedException {
        connectToAuthority();
        extractVersionProperty();
        compareVersions();
    }

    private static void connectToAuthority() throws InterruptedException {
        getRemoteAuthorityLocation();
    }

    private static void getRemoteAuthorityLocation() throws InterruptedException {
        try {
            remoteAuthorityLocation = new URL(ConfigVersion.getAuthorityURI());
        } catch (MalformedURLException e) {
            throw new VersionCheckException("Invalid authority URI", e);
        }
        getRemoteAuthorityConnection();
    }

    private static void getRemoteAuthorityConnection() throws InterruptedException {
        int attemptsMade = 0;
        while (remoteAuthorityConnection == null && ++attemptsMade < ConfigVersion.getConnectAttempts()) {
            try {
                remoteAuthorityConnection = remoteAuthorityLocation.openStream();
                getRemoteAuthorityProperties();
            } catch (IOException e) {
                LogHelper.trace(String.format("Unable to connect, attempt %d of %d", attemptsMade, ConfigVersion.getConnectAttempts()));
                Thread.sleep(ConfigVersion.getRetryDelay());
            } catch (NullPointerException e) {
                throw new VersionCheckException("Unable to connect to remote authority");
            }
        }
    }

    private static void getRemoteAuthorityProperties() {
        try {
            remoteAuthorityProperties = new Properties();
            remoteAuthorityProperties.loadFromXML(remoteAuthorityConnection);
            remoteAuthorityConnection.close();
        } catch (IOException e) {
            throw new VersionCheckException("Remote file may be corrupted", e);
        }
    }

    private static void extractVersionProperty() {
        try {
            remoteVersionProperty = remoteAuthorityProperties.getProperty(Loader.instance().getMCVersionString());
            String[] remoteVersionPropertyTokens = remoteVersionProperty.split("\\|");
            remoteVersionNumber = remoteVersionPropertyTokens[0];
            remoteUpdateLocation = remoteVersionPropertyTokens[1];
        } catch (Exception e) {
            throw new VersionCheckException("Unable to find a version at remote authority");
        }
    }

    private static void compareVersions() {
        if (!getVersionForComparison().equalsIgnoreCase(remoteVersionNumber)) {
            throw new VersionCheckException(String.format("A new version exists. Get it here: %s", remoteUpdateLocation));
        }
    }

    private static String getVersionForComparison() {
        return DarkSoulsCraft.VERSION.split(":")[0];
    }
}