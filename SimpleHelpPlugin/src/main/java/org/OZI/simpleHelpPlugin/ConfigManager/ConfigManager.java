package org.OZI.simpleHelpPlugin.ConfigManager;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class ConfigManager {
    private final FileConfiguration config;

    public ConfigManager(FileConfiguration config) {
        this.config = config;
        config.options().copyDefaults(true);
    }

    public List<String> getHelpCommandOutput() {
        return config.getStringList("Help_Command_Output");
    }
}
