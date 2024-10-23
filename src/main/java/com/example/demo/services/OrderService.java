package com.example.demo.services;

import com.example.demo.models.*;

public interface OrderService {
    CustomerOrder getOrderById(Long orderId);
    void createOrder(CustomerOrder order);
    void addOrderItem(Long orderId, OrderItem item);
    void removeOrderItem(Long orderId, OrderItem item);
    void applyOrderDiscount(Long orderId, Discount discount);
    void processOrderPayment(Long orderId, Payment payment);
    void updateOrderDeliveryStatus(Long orderId, String status);
}