package id.fakhrads.spigotmc.plugin.template.event;

import id.fakhrads.spigotmc.plugin.template.WtsWtbPlugin;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.logging.Logger;

public class MovementListener implements Listener {

    private final Logger logger;

    public MovementListener(WtsWtbPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.logger = plugin.getLogger();
    }

    @EventHandler
    public void movement(PlayerMoveEvent event) {
        Location loc = event.getPlayer().getLocation();
        loc.setY(loc.getY() - 1);
        Block b = loc.getBlock();
        Material material = b.getType();
        switch (material) {
            case WATER:
                b.setType(Material.ICE);
                break;
            case GRASS:
                b.setType(Material.ACACIA_PLANKS);
                break;
            case SAND:
                b.setType(Material.BEDROCK);
                break;
        }
    }
}
