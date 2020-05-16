package EternalHunger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tk.shanebee.hg.events.GameEndEvent;
import tk.shanebee.hg.events.GameStartEvent;

import java.util.List;
import java.util.UUID;

public class EternalHungerListener implements Listener {
    final private PotionEffect potioneffect = new PotionEffect(
            PotionEffectType.HUNGER,
            Integer.MAX_VALUE,
            1,
            false,
            false
    );

    @EventHandler
    public void onGameStart(GameStartEvent event) {
        List<UUID> players = event.getGame().getPlayers();

        for (UUID temp : players) {
            Player player = Bukkit.getPlayer(temp);
            assert player != null;
            player.addPotionEffect(this.potioneffect);
        }
    }

    @EventHandler
    public void onGameEnd(GameEndEvent event) {
        List<UUID> players = event.getGame().getPlayers();

        for (UUID temp : players) {
            Player player = Bukkit.getPlayer(temp);
            assert player != null;
            player.removePotionEffect(PotionEffectType.HUNGER);
        }
    }
}
