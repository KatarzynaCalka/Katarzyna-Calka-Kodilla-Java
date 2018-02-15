package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    private int orderId;
    LocalDateTime dataCreateOrder;
    LocalDateTime dataSendOrder;

    public Order createOrder(){
        return new Order(new Product("01", "Ski", 1200.0),
                new User("Kate", "Calka","user@kodilla.com", "123456"));
    }
}
