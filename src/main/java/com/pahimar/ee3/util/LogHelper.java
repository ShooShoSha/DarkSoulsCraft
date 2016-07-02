/*
 * Copyright 2014. pahimar (pahimar@gmail.com) License: LGPLv3 only
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

package com.pahimar.ee3.util;

import com.shooshosha.darksouls.DarkSoulsCraft;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * @author pahimar
 * @author shooshosha
 */
public class LogHelper {
    public static void log(Level logLevel, String message, Object... formatSpecifiers) {
        FMLLog.log(DarkSoulsCraft.NAME, logLevel, String.format(message, formatSpecifiers));
    }

    public static void all(String message, Object... formatSpecifiers) {
        log(Level.ALL, message, formatSpecifiers);
    }

    public static void debug(String message, Object... formatSpecifiers) {
        log(Level.DEBUG, message, formatSpecifiers);
    }

    public static void error(String message, Object... formatSpecifiers) {
        log(Level.ERROR, message, formatSpecifiers);
    }

    public static void fatal(String message, Object... formatSpecifiers) {
        log(Level.FATAL, message, formatSpecifiers);
    }

    public static void trace(String message, Object... formatSpecifiers) {
        log(Level.TRACE, message, formatSpecifiers);
    }

    public static void off(String message, Object... formatSpecifiers) {
        log(Level.OFF, message, formatSpecifiers);
    }

    public static void info(String message, Object... formatSpecifiers) {
        log(Level.INFO, message, formatSpecifiers);
    }

    public static void warn(String message, Object... formatSpecifiers) {
        log(Level.WARN, message, formatSpecifiers);
    }
}
