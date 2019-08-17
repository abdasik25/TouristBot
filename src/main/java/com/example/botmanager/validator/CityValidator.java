package com.example.botmanager.validator;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * City name validator
 */


public class CityValidator {

    private static final String CITY_REGEX_PATTERN = "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";

    public static boolean validate(String city) {
        return city.matches(CITY_REGEX_PATTERN);
    }
}
