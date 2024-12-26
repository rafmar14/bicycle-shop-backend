package com.example.bicycleshop.order.controller

import com.example.bicycleshop.core.controller.AbstractController
import com.example.bicycleshop.core.dto.OrderDTO
import com.example.bicycleshop.order.model.Order
import com.example.bicycleshop.order.service.OrderService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/orders")
class OrderController (
    private val orderService: OrderService
) : AbstractController<Order, OrderDTO>(orderService) {
}