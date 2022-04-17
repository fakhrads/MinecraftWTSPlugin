package id.fakhrads.spigotmc.plugin.template;

import id.fakhrads.spigotmc.plugin.template.commands.WtsCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class WtsWtbPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("wts").setExecutor(new WtsCommand());
        getLogger().info("load plugin successully!");
    }
}