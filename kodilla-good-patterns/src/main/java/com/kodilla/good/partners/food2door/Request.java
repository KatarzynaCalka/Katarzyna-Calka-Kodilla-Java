package com.kodilla.good.partners.food2door;

import java.time.LocalDate;

public class Request {

    private Provider provider;
    private LocalDate deliveryDate;

    public Request(Provider provider, LocalDate deliveryDate) {
        this.provider = provider;
        this.deliveryDate = deliveryDate;
    }

    public Provider getProvider() {
        return provider;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void requestSummary() {
        System.out.println("Order: " + provider.getProductName()
                + "\nQuantity: " + provider.getProductQuantity()
                + "\nDelivery date: " + deliveryDate);
    }
}
