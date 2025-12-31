package org.OZI.simpleHelpPlugin;

import org.OZI.simpleHelpPlugin.Commaands.PomocCommand;
import org.OZI.simpleHelpPlugin.ConfigManager.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleHelpPlugin extends JavaPlugin {

    private ConfigManager configManager;

    @Override
    public void onEnable() {
        configManager = new ConfigManager(getConfig());
        initConfig();

        getCommand("pomoc").setExecutor(new PomocCommand(configManager));
    }


    @Override
    public void onDisable() {
        saveConfig();
    }

    private void initConfig() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }
}
