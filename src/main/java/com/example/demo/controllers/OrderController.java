package com.example.demo.controllers;

import com.example.demo.models.CustomerOrder;
import com.example.demo.models.Discount;
import com.example.demo.models.Payment;
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

    // Endpoint to handle adding a payment to an order
    @PostMapping("/{orderId}/payments")
    public void addPaymentToOrder(@PathVariable Long orderId, @RequestBody Payment payment) {
        orderService.processOrderPayment(orderId, payment);
    }

    // Endpoint to apply a discount to an order
    @PutMapping("/{orderId}/discount")
    public void applyDiscountToOrder(@PathVariable Long orderId, @RequestBody Discount discount) {
        orderService.applyOrderDiscount(orderId, discount);
    }
}
