package net.mplugins.geoutil;

import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public interface LocationManager {
    PlayerLocationInformation getPlayerInformation(Player player);

    Map<UUID, PlayerLocationInformation> getCache();

    String getServiceName();
}
