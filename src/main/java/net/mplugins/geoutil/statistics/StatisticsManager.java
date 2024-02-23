package net.mplugins.geoutil.statistics;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public interface StatisticsManager {
    void removeStatistics(OfflinePlayer player);

    void addStatisticsEntry(StatisticsType type, Player player);

    StatisticsManager getInstance();
}
