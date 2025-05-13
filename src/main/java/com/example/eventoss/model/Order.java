package com.example.eventoss.model;

import java.util.List;

public class Order {
    private Long id;
    private String email;
    private List<String> productos;

    public Order() {
    }

    public Order(Long id, String email, List<String> productos) {
        this.id = id;
        this.email = email;
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }
}