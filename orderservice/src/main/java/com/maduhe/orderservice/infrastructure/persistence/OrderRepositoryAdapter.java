package com.maduhe.orderservice.infrastructure.persistence;

import com.maduhe.orderservice.domain.model.Order;
import com.maduhe.orderservice.domain.repository.OrderRepository;
import lombok.AllArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class OrderRepositoryAdapter implements OrderRepository {
    private final JpaOrderRepository jpaRepository;

    @Override
    public Order save(Order order) {
        return jpaRepository.save(order);
    }

    @Override
    public Optional<Order> findById(UUID id) {
        return jpaRepository.findById(id);
    }
}
