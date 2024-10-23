package com.example.demo.services;

import com.example.demo.models.Customer;

public interface CustomerService {
    Customer getCustomerById(Long customerId);
    void updateCustomerAddress(Long customerId, String newAddress);
    void updateCustomerEmail(Long customerId, String newEmail);
}