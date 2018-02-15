package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class RequestApplication {

    public static void main (String[] args) {

        Provider provider = new Provider("ExtraFoodShop", "carrot juice", 50.);
        LocalDate deliveryDate = LocalDate.of(2018, 02, 16);
        Request request = new Request(provider, deliveryDate);
        ProcessOrder processOrder = new ProcessOrder();

        processOrder.processExtraFoodShop(request);
        request.requestSummary();
    }
}
