package net.mplugins.geoutil.api.statistics;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public interface StatisticsManager {
    /**
     * This will remove the player from the statistic specified in {@link StatisticsType}
     *
     * @param statisticsType the type of statistic
     * @param player the player
     */
    void removeStatistics(StatisticsType statisticsType, OfflinePlayer player);

    /**
     * This will add the player to the statistic specified in {@link StatisticsType}
     *
     * @param statisticsType the type of statistic
     * @param player the player
     */
    void addStatisticsEntry(StatisticsType statisticsType, Player player);

    /**
     * Obtain an instance for StatisticsManager
     *
     * @return the singleton instance
     */
    StatisticsManager getInstance();
}
