package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("123")));
        europe.addCountry(new Country("Germany", new BigDecimal("456")));
        europe.addCountry(new Country("France", new BigDecimal("789")));

        Continent asia = new Continent();
        asia.addCountry(new Country("Russia", new BigDecimal("987")));
        asia.addCountry(new Country("China", new BigDecimal("654")));
        asia.addCountry(new Country("India", new BigDecimal("321")));

        Continent africa = new Continent();
        africa.addCountry(new Country("Niger", new BigDecimal("147")));
        africa.addCountry(new Country("Tunisia", new BigDecimal("258")));
        africa.addCountry(new Country("Kenya", new BigDecimal("369")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("4104"), totalPeopleQuantity);
    }
}
