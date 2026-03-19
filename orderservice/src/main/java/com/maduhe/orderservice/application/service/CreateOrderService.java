package com.maduhe.orderservice.application.service;

import com.maduhe.orderservice.domain.model.Order;
import com.maduhe.orderservice.domain.model.OrderStatus;
import com.maduhe.orderservice.domain.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOrderService {
    private final OrderRepository orderRepository;

    public Order create(Double amount) {
        Order order = Order.builder()
                .amount(amount)
                .status(OrderStatus.CREATED)
                .build();

        return orderRepository.save(order);
    }
}
