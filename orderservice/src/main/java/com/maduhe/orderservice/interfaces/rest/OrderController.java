package com.maduhe.orderservice.interfaces.rest;


import com.maduhe.orderservice.application.service.CreateOrderService;
import com.maduhe.orderservice.domain.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderService createOrderService;


    @PostMapping
    public Order create(@RequestParam Double amount) {
        return createOrderService.create(amount);
    }
}
