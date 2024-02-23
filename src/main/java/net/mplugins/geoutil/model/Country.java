package net.mplugins.geoutil.model;

public interface Country {
    /**
     * This is the official english name of that country
     *
     * @return the name of the country.
     */
    String getName();

    /**
     * This is the official two-letter country code.
     *
     * @return the country code of this country
     */
    String getCountryCode();

    /**
     * This is the name of the official currency used in this country.
     *
     * @return the currency
     */
    String getCurrency();

    /**
     * This is the flag of the country as an emoji.
     *
     * @return the flag
     */
    String getFlagEmoji();

    /**
     * This is the time zone this country is in.
     *
     * @return the timezone
     */
    String getTimeZone();

    /**
     * This is the name of the continent that country is in, wrapped in a {@link Continent} object.
     *
     *  @return the continent
     */
    Continent getContinent();
}
