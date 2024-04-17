package org.thesalutyt.simpledrinks;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import org.slf4j.Logger;

public class SDRes {
    public static final String MODID = "simpledrinks";
    public static final String DISPLAY_NAME = "SimpleDrinks";
    public static final String VERSION = "v.0.0.1-Alpha";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Minecraft MC = Minecraft.getInstance();
    public static final User USER = MC.getUser();
    public static final String PLAYER_NAME = USER.getName();

    public static String createInfoMessage() {
        return String.format("%s %s initialized successfully!", DISPLAY_NAME, VERSION);
    }
}