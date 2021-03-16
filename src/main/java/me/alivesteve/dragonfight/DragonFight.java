package me.alivesteve.dragonfight;

import org.bukkit.plugin.java.JavaPlugin;

public final class DragonFight extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("dragonfight").setExecutor(new DragonCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
