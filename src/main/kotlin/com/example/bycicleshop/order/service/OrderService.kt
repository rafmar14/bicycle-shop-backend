package com.example.bycicleshop.order.service

import com.example.bycicleshop.order.repository.OrderRepository
import com.example.bycicleshop.core.dto.OrderDTO
import com.example.bycicleshop.core.service.AbstractJpaService
import com.example.bycicleshop.order.mapper.OrderMapper
import com.example.bycicleshop.order.model.Order
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderMapper: OrderMapper,
    private val orderRepository: OrderRepository
) : AbstractJpaService<Order, OrderDTO>
    (orderMapper, orderRepository) {}