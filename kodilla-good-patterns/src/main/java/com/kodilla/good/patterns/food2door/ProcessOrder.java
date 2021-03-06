package com.kodilla.good.patterns.food2door;

public class ProcessOrder extends com.kodilla.good.patterns.food2door.Process {

    public void processExtraFoodShop (Request request) {
        System.out.println(super.process() + "\nPlease make your payment before delivery.");
    }

    public void processHealthyGluten (Request request) {
        System.out.println(super.process() + "\nYou received a 5% discount for next order.");
    }

    public void processGlutenFreeShop (Request request) {
        System.out.println(super.process() + "\nYou received 10 points for your order.");
    }
}
