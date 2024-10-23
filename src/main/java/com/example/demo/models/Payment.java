package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data // Lombok generates getters, setters, toString, equals, hashCode, etc.
@NoArgsConstructor // Lombok generates a no-argument constructor
@AllArgsConstructor // Lombok generates an all-argument constructor
public class Payment {
    @Id
    private Long paymentId;
    private BigDecimal amount;
    private Date paymentDate;
    private String paymentStatus;
}
