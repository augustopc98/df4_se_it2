package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Discount {
    @Id
    private Long discountId;
    private BigDecimal discountPercentage;
    private String discountDescription;


    public Discount(Long discountId, BigDecimal discountPercentage, String discountDescription) {
        this.discountId = discountId;
        this.discountPercentage = discountPercentage;
        this.discountDescription = discountDescription;
    }

    public Discount() {
    }

    public BigDecimal applyDiscount(BigDecimal totalAmount) {
        return totalAmount.subtract(totalAmount.multiply(discountPercentage));
    }
    // Constructors, Getters and Setters
}