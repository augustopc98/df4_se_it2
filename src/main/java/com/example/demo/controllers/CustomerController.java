package com.example.demo.controllers;

import com.example.demo.models.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}/address")
    public void updateCustomerAddress(@PathVariable Long id, @RequestParam String address) {
        customerService.updateCustomerAddress(id, address);
    }

    @PutMapping("/{id}/email")
    public void updateCustomerEmail(@PathVariable Long id, @RequestParam String email) {
        customerService.updateCustomerEmail(id, email);
    }
}