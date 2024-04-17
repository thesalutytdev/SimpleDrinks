package org.thesalutyt.simpledrinks.common.events;

import java.util.HashMap;
import java.util.UUID;

public class EventManager {
    private EventManager eventManager;
    public HashMap<UUID, Boolean> managers = new HashMap<>();
    public HashMap<UUID, EventType> eventWaiting = new HashMap<>();
    public HashMap<String, Runnable> onMessageEvent = new HashMap<>();
    public HashMap<String, Runnable> onInteract = new HashMap<>();
    public HashMap<UUID, Runnable> onPlayerSleep = new HashMap<>();
    public static String waitedMessage;
    public static String waitedMessageNoPlayerTag;
    public static Boolean onJoinActive = false;
}
