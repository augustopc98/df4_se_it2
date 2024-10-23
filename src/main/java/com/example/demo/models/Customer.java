package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private Long customerId;
    private String customerAddress;
    private String customerEmail;

    // Constructors, Getters and Setters
}