package com.example.eventoss.evento;

import com.example.eventoss.model.Order;
import org.springframework.context.ApplicationEvent;

import java.util.List;

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

    // Método para obtener el ID de la orden
    public Long getOrderId() {
        return order.getId();  // Asumiendo que Order tiene un campo id
    }

    // Método para obtener el correo (asumiendo que Order tiene un campo email)
    public String getEmail() {
        return order.getEmail();  // Asumiendo que Order tiene un campo email
    }

    // Método para obtener los productos de la orden
    public List<String> getProducts() {
        return order.getProductos();  // Asumiendo que Order tiene un campo productos
    }
}
