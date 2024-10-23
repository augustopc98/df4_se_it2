package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data // Lombok annotation for generating getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all fields

public class Customer {
    @Id
    private Long customerId;
    private String customerAddress;
    private String customerEmail;

    // Constructors, Getters and Setters
}