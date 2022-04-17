package id.fakhrads.spigotmc.plugin.template;

import id.fakhrads.spigotmc.plugin.template.commands.WtsCommand;
import id.fakhrads.spigotmc.plugin.template.commands.WtbCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class WtsWtbPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("wtb").setExecutor(new WtbCommand());
        this.getCommand("wts").setExecutor(new WtsCommand());
        getLogger().info("load plugin successully!");
    }
}