package com.example.eventoss.listener;

import com.example.eventoss.evento.OrderCreatedEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;

public class EmailNotificationListener implements ApplicationListener<OrderCreatedEvent> {
    private static final Logger logger = LogManager.getLogger(EmailNotificationListener.class);

    @Override
    public void onApplicationEvent(OrderCreatedEvent event) {
        logger.info("Enviando correo de confirmación a " + event.getEmail());
    }
}