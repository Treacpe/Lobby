package treacpe.me.lobby;

import org.bukkit.plugin.java.JavaPlugin;

public final class Lobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Lobby plugin has succesfully loaded into the server!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Lobby plugin has successfully disabled from the server");
    }
}
