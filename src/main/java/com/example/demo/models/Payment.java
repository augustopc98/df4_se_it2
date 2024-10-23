package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Payment {
    @Id
    private Long paymentId;
    private BigDecimal amount;
    private Date paymentDate;
    private String paymentStatus;

    // Constructors, Getters and Setters
}