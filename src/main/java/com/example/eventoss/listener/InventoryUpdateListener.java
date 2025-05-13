package com.example.eventoss.listener;

import com.example.eventoss.evento.OrderCreatedEvent;
import com.example.eventoss.model.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InventoryUpdateListener {

    private static final Logger log = LoggerFactory.getLogger(InventoryUpdateListener.class);

    // Simulación de inventario
    private final Map<Long, Integer> inventario = new HashMap<>();

    public InventoryUpdateListener() {
        // Inicializa el inventario con algunos productos
        inventario.put(1L, 100); // Producto con ID 1 tiene 100 unidades
        inventario.put(2L, 200); // Producto con ID 2 tiene 200 unidades
    }

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        for (Producto producto : event.getProductos()) {
            reducirStock(producto.getId(), producto.getCantidad());
        }
        log.info("Stock actualizado por OrderCreatedEvent");
    }

    private void reducirStock(Long productoId, int cantidad) {
        if (!inventario.containsKey(productoId)) {
            log.warn("Producto con ID {} no encontrado en el inventario", productoId);
            return;
        }

        int stockActual = inventario.get(productoId);
        if (stockActual < cantidad) {
            log.warn("Stock insuficiente para el producto con ID {}. Stock actual: {}, Cantidad solicitada: {}", productoId, stockActual, cantidad);
            return;
        }

        inventario.put(productoId, stockActual - cantidad);
        log.info("Stock del producto con ID {} reducido en {}. Stock restante: {}", productoId, cantidad, inventario.get(productoId));
    }
}
