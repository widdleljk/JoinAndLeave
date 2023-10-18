package me.widdleljk.joinandleaveupdate;

import me.widdleljk.joinandleaveupdate.listener.JoinAndLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinAndLeaveUpdate extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting up!");
        getServer().getPluginManager().registerEvents(new JoinAndLeaveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
