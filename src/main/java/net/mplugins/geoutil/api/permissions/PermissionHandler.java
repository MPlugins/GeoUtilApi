package net.mplugins.geoutil.api.permissions;

public interface PermissionHandler {

    /**
     * Allow users from a specific country to join this server.
     *
     * @param countryCode the two letter country-code for the region to allow
     */
    void allowJoin(String countryCode);

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
