package id.fakhrads.spigotmc.plugin.wtswtb.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class WtbCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();
            //ItemStack itemstack = new ItemStack(Material.DIAMOND, 64);
            //inventory.addItem(itemstack);
            
            if(args[0] == null) {
                sender.sendMessage("Argument Cannot Null!");
                return false;
            } else {
                Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE +"WTB > " + ChatColor.AQUA + args[0].toString());
            }
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        return false;
    }
}
