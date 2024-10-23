package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class OrderItem {
    @Id
    private Long id;
    private Long productId;
    private int quantity;
    private BigDecimal productPrice;

    // Constructors, Getters and Setters
}