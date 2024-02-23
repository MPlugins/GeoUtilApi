import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public interface LocationManager {
    ApiConnectionResponse getPlayerInformation(Player player);

    Map<UUID, ApiConnectionResponse> getCache();

    String getServiceName();
}
