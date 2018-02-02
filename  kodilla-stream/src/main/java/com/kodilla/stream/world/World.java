package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {

    private final List<Continent> theContinentList = new ArrayList<>();

    public void addContinent(Continent continent) {
        theContinentList.add(continent);
    }

    public List<Continent> getTheContinentList() {
        return theContinentList;
    }

    public Set<BigDecimal> getPeopleQuantity() {
        return theContinentList.stream()
            .flatMap(continent -> continent.getTheCountryList().stream())
            .map(Country::getPeopleQuantity)
            .collect(Collectors.toSet());

    }
}
