package com.kodilla.good.patterns.allegro;

import java.util.Random;

public class OrderProcessor {

    public boolean canOrder(Order order){
        Random random = new Random();
        return random.nextBoolean();
    }

    public void processOrder(Order order){
        System.out.println("Order has been processed.");
    }
}
