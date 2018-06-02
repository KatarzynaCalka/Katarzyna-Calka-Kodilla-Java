package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza component: dough, tomato sauce, mozzarella", description);
    }


    @Test
    public void testMyPizzaOrderCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ArugulaDecorator(theOrder);
        theOrder = new ExtraMozzarellaDecorator(theOrder);
        theOrder = new ExtraTomatoSauce(theOrder);
        theOrder = new TomatoesDecorator(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testMyPizzaOrderDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ArugulaDecorator(theOrder);
        theOrder = new ExtraMozzarellaDecorator(theOrder);
        theOrder = new ExtraTomatoSauce(theOrder);
        theOrder = new TomatoesDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza component: dough, tomato sauce, mozzarella + arugula + extra mozzarella + extra tomato sauce + tomatoes", description);
    }
}
