package net.mplugins.geoutil.api;

import net.mplugins.geoutil.api.permissions.PermissionHandler;
import net.mplugins.geoutil.api.statistics.StatisticsManager;

import java.util.Locale;

public final class GeoUtilApi {
    private static LocationManager locationManager;
    private static StatisticsManager statisticsManager;
    private static PermissionHandler permissionHandler;

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

    public static PermissionHandler getPermissionHandler() {
        return permissionHandler;
    }

    public static void setPermissionHandler(PermissionHandler permissionHandler) {
        GeoUtilApi.permissionHandler = permissionHandler;
    }
}
