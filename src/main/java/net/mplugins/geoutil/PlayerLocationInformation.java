package net.mplugins.geoutil;

import net.mplugins.geoutil.model.Country;

import java.util.UUID;

public interface PlayerLocationInformation {

    /**
     * Returns the uuid of the player that this {@link PlayerLocationInformation} belongs to.
     *
     * @return uuid of the player this information belongs to
     */
    UUID getPlayer();

    /**
     * Depending on the service used to obtain this {@link PlayerLocationInformation} object, accuracy of city can vary.
     *
     * @return the name of the city
     */
    String getCity();

    /**
     * This is usually very accurate among all services.
     *
     * @return the name country
     */
    Country getCountry();
}
