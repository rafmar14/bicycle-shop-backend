package com.example.bycicleshop.order.controller

import com.example.bycicleshop.core.controller.AbstractController
import com.example.bycicleshop.core.dto.OrderDTO
import com.example.bycicleshop.order.model.Order
import com.example.bycicleshop.order.service.OrderService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/orders")
class OrderController (
    private val orderService: OrderService
) : AbstractController<Order, OrderDTO>(orderService) {
}