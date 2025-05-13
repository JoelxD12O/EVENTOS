package com.example.eventoss.evento;

import com.example.eventoss.model.Order;
import com.example.eventoss.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        orderService.processOrder(order);
        return "Pedido recibido con ID: " + order.getId();
    }

}