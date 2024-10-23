package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public CustomerOrder getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public void createOrder(CustomerOrder order) {
        orderRepository.save(order);
    }

    @Override
    public void addOrderItem(Long orderId, OrderItem item) {
        CustomerOrder order = getOrderById(orderId);
        if (order != null) {
            order.getItems().add(item);
            orderRepository.save(order);
        }
    }

    @Override
    public void removeOrderItem(Long orderId, OrderItem item) {
        CustomerOrder order = getOrderById(orderId);
        if (order != null) {
            order.getItems().remove(item);
            orderRepository.save(order);
        }
    }

    @Override
    public void applyOrderDiscount(Long orderId, Discount discount) {
        CustomerOrder order = getOrderById(orderId);
        if (order != null && discount != null) {
            BigDecimal totalAmount = order.calculateTotal();
            BigDecimal discountedAmount = discount.applyDiscount(totalAmount);
            // Handle the discount application
            orderRepository.save(order);
        }
    }

    @Override
    public void processOrderPayment(Long orderId, Payment payment) {
        CustomerOrder order = getOrderById(orderId);
        if (order != null) {
            order.getPayments().add(payment);
            orderRepository.save(order);
        }
    }

    @Override
    public void updateOrderDeliveryStatus(Long orderId, String status) {
        CustomerOrder order = getOrderById(orderId);
        if (order != null) {
            order.setDeliveryStatus(status);
            orderRepository.save(order);
        }
    }
}