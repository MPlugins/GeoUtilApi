package net.mplugins.geoutil.model;

public interface Country {
    String getName();

    String getCountryCode();

    String getCurrency();

    String getFlagEmoji();

    String getTimeZone();

    Continent getContinent();
}
