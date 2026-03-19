package com.maduhe.orderservice.domain.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private UUID id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
