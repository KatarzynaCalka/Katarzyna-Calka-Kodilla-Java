package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;

    public Country(String nameOfCountry, BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!nameOfCountry.equals(country.nameOfCountry)) return false;
        return peopleQuantity.equals(country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        int result = nameOfCountry.hashCode();
        result = 31 * result + peopleQuantity.hashCode();
        return result;
    }
}
