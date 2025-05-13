package com.example.eventoss.listener;

import com.example.eventoss.evento.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AuditLogListener {

    // Creamos un logger para registrar en los logs
    private static final Logger logger = LoggerFactory.getLogger(AuditLogListener.class);

    // Este método manejará el evento de tipo OrderCreatedEvent
    @Async // Hacemos que el evento sea asincrónico
    @EventListener // Escucha el evento de tipo OrderCreatedEvent
    public void handleOrderCreatedEvent(OrderCreatedEvent event) {
        // Registra el evento en los logs. Simulamos el registro del pedido.
        logger.info("Pedido registrado en los logs. ID: {}, Email: {}, Producto: {}",
                event.getOrderId(), event.getEmail(), event.getProducts());
    }
}
