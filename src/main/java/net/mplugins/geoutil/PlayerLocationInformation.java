package net.mplugins.geoutil;

import net.mplugins.geoutil.model.Country;

import java.util.UUID;

public interface PlayerLocationInformation {
    UUID getPlayer();

    String getCity();

    Country getCountry();
}
