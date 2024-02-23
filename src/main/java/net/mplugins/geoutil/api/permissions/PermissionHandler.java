package net.mplugins.geoutil.api.permissions;

public interface PermissionHandler {
    /**
     * Prevent users from a specific country from joining this server (geo-blocking).
     *
     * @param countryCode the two letter country-code for the region to geo-block
     */
    void denyJoin(String countryCode);

    /**
     *
     * @param countryCode the two letter country-code for the region to test for geo-blocking
     * @return true if country is geo-blocked, false otherwise.
     */
    boolean canJoin(String countryCode);
}
