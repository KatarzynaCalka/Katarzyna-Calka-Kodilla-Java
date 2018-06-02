package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class WatcherProcessOrder {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherProcessOrder.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() +
                "Items: " + order.getItems().stream()
                .map(n -> n.getProductId().toString())
                .collect(Collectors.joining(";")) +
                "UserId: " + userId.toString());
    }
}
