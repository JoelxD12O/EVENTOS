package com.example.eventoss.evento;

import com.example.eventoss.model.Order;
import org.springframework.context.ApplicationEvent;

public class OrderCreatedEvent extends ApplicationEvent {

    private final Order order;

    // Constructor
    public OrderCreatedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

    // Getter for order
    public Order getOrder() {
        return order;
    }
}

