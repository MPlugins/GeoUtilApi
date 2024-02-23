package net.mplugins.geoutil.api;

public class GeoUtilApi {
    private static LocationManager locationManager;

    public static void setLocationManager(LocationManager locationManager) {
        GeoUtilApi.locationManager = locationManager;
    }

    public static LocationManager getLocationManager() {
        return locationManager;
    }
}
