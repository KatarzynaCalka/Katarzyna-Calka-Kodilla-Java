package com.kodilla.good.partners.food2door;

public class Provider {

    private String providerName;
    private String productName;
    private double productQuantity;

    public Provider(String providerName, String productName, double productQuantity) {
        this.providerName = providerName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}
