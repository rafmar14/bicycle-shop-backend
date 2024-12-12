package com.example.bycicleshop.cart.cartcomponent.mapper

import com.example.bycicleshop.cart.cartcomponent.model.CartComponent
import com.example.bycicleshop.core.dto.CartComponentDTO
import com.example.bycicleshop.core.mapper.DomainMapper
import org.springframework.stereotype.Component

@Component
class CartComponentMapper : DomainMapper<CartComponent, CartComponentDTO> {
    override fun toDTO(entity: CartComponent): CartComponentDTO {
        return CartComponentDTO(entity.id, entity.order, entity.component)
    }

    override fun toEntity(dto: CartComponentDTO): CartComponent {
        return CartComponent(dto.id, dto.order, dto.component)
    }
}

