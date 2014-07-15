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
import net.minecraftforge.common.config.Configuration;

/**
 * @author shooshosha
 * @date Dec 2, 2013
 *
 */
public final class ConfigVersion {
    public static final String CATEGORY_VERSION = "version";
    private static String authorityURI = "https://raw.github.com/ShooShoSha/DarkSoulsCraft/release/version.xml";
    private static int connectAttempts = 3;
    private static int retryDelay = 10000;

    public static void loadVersionConfigurations(Configuration configuration) {
        LogHelper.trace("Loading version configurations");

        authorityURI = configuration.getString("authorityURI", CATEGORY_VERSION, authorityURI, "Remote version authority URI");
        connectAttempts = configuration.getInt("connectAttempts", CATEGORY_VERSION, connectAttempts, 0, 3, "Max connection attempts to remote version authority");
        retryDelay = configuration.getInt("retryDelay", CATEGORY_VERSION, retryDelay, 100, 60000, "Delay (in milliseconds) between connection attempts");

        LogHelper.trace("Version configurations loaded");

        try {
            VersionHelper.runCheck();
        } catch (InterruptedException threadInterruptedException) {
            LogHelper.fatal("Version thread interrupted!%n%s", threadInterruptedException);
        }
    }

    private ConfigVersion() {
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
