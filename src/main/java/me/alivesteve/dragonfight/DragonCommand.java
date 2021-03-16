package me.alivesteve.dragonfight;

import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class DragonCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("billy.dragon")) {
            Player player = (Player) sender;
            World world = player.getWorld();
            player.sendMessage(String.valueOf(Objects.requireNonNull(Objects.requireNonNull(world.getEnderDragonBattle()).getEnderDragon()).getHealth()));
            Objects.requireNonNull(Objects.requireNonNull(world.getEnderDragonBattle().getEnderDragon()).getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(1000);
            Objects.requireNonNull(world.getEnderDragonBattle().getEnderDragon()).setHealth(1000);
            player.sendMessage("Health is now " + Objects.requireNonNull(Objects.requireNonNull(world.getEnderDragonBattle()).getEnderDragon()).getHealth());

        }
        return true;
    }
}
