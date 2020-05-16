package EternalHunger;

import org.bukkit.plugin.java.JavaPlugin;

public class EternalHunger extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("EternalHunger Extension for HungerGames enabled");
        getServer().getPluginManager().registerEvents(new EternalHungerListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("EternalHunger Extension for HungerGames disabled");
    }
}
