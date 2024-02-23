package net.mplugins.geoutil.api;

import net.mplugins.geoutil.api.statistics.StatisticsManager;

public final class GeoUtilApi {
    private static LocationManager locationManager;
    private static StatisticsManager statisticsManager;

    private GeoUtilApi() {}

    public static void setLocationManager(LocationManager locationManager) {
        GeoUtilApi.locationManager = locationManager;
    }

    public static LocationManager getLocationManager() {
        return locationManager;
    }

    public static StatisticsManager getStatisticsManager() {
        return statisticsManager;
    }

    public static void setStatisticsManager(StatisticsManager statisticsManager) {
        GeoUtilApi.statisticsManager = statisticsManager;
    }
}
