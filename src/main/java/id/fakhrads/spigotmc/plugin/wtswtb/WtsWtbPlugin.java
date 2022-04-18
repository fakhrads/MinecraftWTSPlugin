package id.fakhrads.spigotmc.plugin.wtswtb;

import org.bukkit.plugin.java.JavaPlugin;

import id.fakhrads.spigotmc.plugin.wtswtb.commands.WtbCommand;
import id.fakhrads.spigotmc.plugin.wtswtb.commands.WtsCommand;
import org.bukkit.configuration.file.FileConfiguration;
import java.util.List;

public class WtsWtbPlugin extends JavaPlugin {
    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getConfig();
        this.getCommand("wtb").setExecutor(new WtbCommand());
        this.getCommand("wts").setExecutor(new WtsCommand());
        getLogger().info("load plugin successully!");
    }
}