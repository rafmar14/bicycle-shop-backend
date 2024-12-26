package com.example.bicycleshop.order.service

import com.example.bicycleshop.order.repository.OrderRepository
import com.example.bicycleshop.core.dto.OrderDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import com.example.bicycleshop.order.mapper.OrderMapper
import com.example.bicycleshop.order.model.Order
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderMapper: OrderMapper,
    private val orderRepository: OrderRepository
) : AbstractJpaService<Order, OrderDTO>
    (orderMapper, orderRepository) {}