package com.example.demo.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class CustomerOrder {
    @Id
    private Long id;
    private Long customerId;
    private Date orderDate;
    private String deliveryStatus;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();

    // Constructors, Getters and Setters
}