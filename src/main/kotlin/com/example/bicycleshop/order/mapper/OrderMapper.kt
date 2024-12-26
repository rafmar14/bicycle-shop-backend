package com.example.bicycleshop.order.mapper

import com.example.bicycleshop.combination.mapper.CombinationMapper
import com.example.bicycleshop.component.mapper.ComponentMapper
import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.core.dto.OrderDTO
import com.example.bicycleshop.customer.mapper.CustomerMapper
import com.example.bicycleshop.order.model.Order
import org.springframework.stereotype.Component

@Component
class OrderMapper(private val customerMapper: CustomerMapper,
    private val componentMapper: ComponentMapper,
    private val combinationMapper: CombinationMapper
) : DomainMapper<Order, OrderDTO> {
    override fun toDTO(entity: Order): OrderDTO {
        return OrderDTO(entity.id, customerMapper.toDTO(entity.customer),
            entity.components.map(componentMapper::toDTO),
            entity.combinations.map(combinationMapper::toDTO))
    }

    override fun toEntity(dto: OrderDTO): Order {
        return Order(dto.id, customerMapper.toEntity(dto.customer),
            dto.components.map(componentMapper::toEntity),
            dto.combinations.map(combinationMapper::toEntity))
    }
}