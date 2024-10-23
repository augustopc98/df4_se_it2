package com.example.demo.controllers;

import com.example.demo.models.*;
import com.example.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public CustomerOrder getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/")
    public void createOrder(@RequestBody CustomerOrder order) {
        orderService.createOrder(order);
    }

    // Additional endpoints for add/remove items, process payment, etc.
}