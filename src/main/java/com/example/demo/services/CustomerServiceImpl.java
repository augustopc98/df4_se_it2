package com.example.demo.services;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public void updateCustomerAddress(Long customerId, String newAddress) {
        Customer customer = getCustomerById(customerId);
        if (customer != null) {
            customer.setCustomerAddress(newAddress);
            customerRepository.save(customer);
        }
    }

    @Override
    public void updateCustomerEmail(Long customerId, String newEmail) {
        Customer customer = getCustomerById(customerId);
        if (customer != null) {
            customer.setCustomerEmail(newEmail);
            customerRepository.save(customer);
        }
    }
}