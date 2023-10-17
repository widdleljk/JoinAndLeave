package me.skycraftalfieedyvean.joinandleave;

import org.bukkit.plugin.java.JavaPlugin;
import me.skycraftalfieedyvean.joinandleave.listeners.PlayerJoinListener;

public final class JoinAndLeave extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting up!");
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
