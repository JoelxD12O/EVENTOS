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

    // Agregar métodos para acceder a propiedades de la orden

    // Método para obtener el ID de la orden
    public Long getOrderId() {
        return order.getId();  // Asumiendo que Order tiene un campo id
    }

    // Método para obtener el correo (asumiendo que Order tiene un campo email)
    public String getEmail() {
        return order.getEmail();  // Asumiendo que Order tiene un campo email
    }

    // Método para obtener el producto (asumiendo que Order tiene un campo product)
    public String getProduct() {
        return order.getProduct();  // Asumiendo que Order tiene un campo product
    }
}
