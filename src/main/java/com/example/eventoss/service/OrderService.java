package com.example.eventoss.service;

import com.example.eventoss.evento.OrderCreatedEvent;
import com.example.eventoss.model.Order;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void processOrder(Order order) {
        // Aquí podrías guardar la orden en una base de datos si fuese necesario
        // Por ahora solo publicamos el evento
        publisher.publishEvent(new OrderCreatedEvent(this, order));
    }
}