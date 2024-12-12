package com.example.bycicleshop.order.mapper

import com.example.bycicleshop.core.mapper.DomainMapper
import com.example.bycicleshop.core.dto.OrderDTO
import com.example.bycicleshop.order.model.Order
import org.springframework.stereotype.Component

@Component
class OrderMapper : DomainMapper<Order, OrderDTO> {
    override fun toDTO(entity: Order): OrderDTO {
        return OrderDTO(entity.id, entity.customer, entity.components, entity.combinations)
    }

    override fun toEntity(dto: OrderDTO): Order {
        return Order(dto.id, dto.customer, dto.components, dto.combinations)
    }
}