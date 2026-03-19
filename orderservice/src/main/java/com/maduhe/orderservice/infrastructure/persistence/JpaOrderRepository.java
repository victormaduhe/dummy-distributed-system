package com.maduhe.orderservice.infrastructure.persistence;

import com.maduhe.orderservice.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderRepository extends JpaRepository<Order, UUID> {
}
