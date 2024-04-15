package org.thesalutyt.simpledrinks;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class SDRes {
    public static final String MODID = "simpledrinks";
    public static final String DISPLAY_NAME = "SimpleDrinks";
    public static final String VERSION = "v.0.0.1-Alpha";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static String createInfoMessage() {
        return String.format("%s %s initialized successfully!", DISPLAY_NAME, VERSION);
    }
}