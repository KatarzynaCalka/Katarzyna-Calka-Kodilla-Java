package com.kodilla.good.patterns.allegro;

public class Order {

    private Product product;
    private User user;

    public Order(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
