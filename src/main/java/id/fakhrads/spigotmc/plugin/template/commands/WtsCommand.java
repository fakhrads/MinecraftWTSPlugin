package id.fakhrads.spigotmc.plugin.template.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class WtsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();
            //ItemStack itemstack = new ItemStack(Material.DIAMOND, 64);
            //inventory.addItem(itemstack);
            if(args == null) {
                sender.sendMessage("Argument Cannot Null!");
                return false;
            } else {
                Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE +"WTS > " + ChatColor.AQUA + args.toString());
            }
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        return false;
    }
}
