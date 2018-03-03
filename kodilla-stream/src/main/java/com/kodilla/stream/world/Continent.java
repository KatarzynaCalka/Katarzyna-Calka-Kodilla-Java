package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Continent {
    private final List<Country> theCountryList = new ArrayList<>();

    public void addCountry(Country country){
        theCountryList.add(country);
    }

    public List<Country> getTheCountryList() {
        return theCountryList;
    }
}

