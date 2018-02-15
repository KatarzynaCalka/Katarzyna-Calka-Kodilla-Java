package com.kodilla.good.patterns.allegro;

public class Application {
    public static void main(String[] args) {

        InformationService informationService = new MailService();

        OrderService orderService = new ProductOrderService();
        Order order = orderService.createOrder();
        OrderProcessor orderProcessor = new OrderProcessor();

        OrderRepository orderRepository = new ProductRepository();

        if (orderProcessor.canOrder(order)) {
            informationService.sendMessageToUser(order.getUser());
            orderProcessor.processOrder(order);
            orderRepository.saveOrderInTheBase(order);
        } else {
            System.out.println("Can not process order.");
        }
    }
}
