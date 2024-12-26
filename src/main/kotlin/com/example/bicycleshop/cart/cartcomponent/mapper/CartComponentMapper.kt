package com.example.bicycleshop.cart.cartcomponent.mapper

import com.example.bicycleshop.cart.cartcomponent.model.CartComponent
import com.example.bicycleshop.combination.mapper.CombinationMapper
import com.example.bicycleshop.component.mapper.ComponentMapper
import com.example.bicycleshop.core.dto.CartComponentDTO
import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.order.mapper.OrderMapper
import org.springframework.stereotype.Component

@Component
class CartComponentMapper(private val orderMapper: OrderMapper, private val componentMapper: ComponentMapper) :
    DomainMapper<CartComponent, CartComponentDTO> {
    override fun toDTO(entity: CartComponent): CartComponentDTO {
        return CartComponentDTO(entity.id, orderMapper.toDTO(entity.order), componentMapper.toDTO(entity.component))
    }

    override fun toEntity(dto: CartComponentDTO): CartComponent {
        return CartComponent(dto.id, orderMapper.toEntity(dto.order), componentMapper.toEntity(dto.component))
    }
}

