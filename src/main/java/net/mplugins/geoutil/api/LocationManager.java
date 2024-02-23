package net.mplugins.geoutil.api;

import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public interface LocationManager {
    /**
     * Use this method to get {@link PlayerLocationInformation} from specified player.
     *
     * @param player the player you want to get location information from
     * @return location information
     */
    PlayerLocationInformation getPlayerInformation(Player player);

    /**
     * Use this method to get {@link PlayerLocationInformation} from specified player uuid.
     *
     * @param player the uuid of the player you want to get location information from
     * @return location information
     */
    PlayerLocationInformation getPlayerInformation(UUID player, String ip);

    /**
     * Get all cached {@link PlayerLocationInformation}
     *
     * @return all cached {@link PlayerLocationInformation}
     */
    Map<UUID, PlayerLocationInformation> getCache();

    /**
     *
     * @return the name of the service providing {@link PlayerLocationInformation}
     */
    String getServiceName();
}
