package org.OZI.simpleHelpPlugin.Commaands;

import org.OZI.simpleHelpPlugin.ConfigManager.ConfigManager;
import org.OZI.simpleHelpPlugin.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jspecify.annotations.NonNull;

import java.util.List;

public class PomocCommand implements org.bukkit.command.CommandExecutor {

    private final ConfigManager configManager;

    public PomocCommand(ConfigManager configManager) {
        this.configManager = configManager;
    }

    @Override
    public boolean onCommand(@NonNull CommandSender sender, @NonNull Command command, @NonNull String label, @NonNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("This command is only for players!");
            return true;
        }

        List<String> messages = configManager.getHelpCommandOutput();
        for (String msg : messages) {
            player.sendMessage(ChatUtil.colorize(msg));
        }
        return true;
    }
}
