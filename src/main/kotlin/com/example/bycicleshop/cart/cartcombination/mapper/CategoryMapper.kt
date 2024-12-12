package com.example.bycicleshop.cart.cartcombination.mapper

import com.example.bycicleshop.cart.cartcombination.model.CartCombination
import com.example.bycicleshop.core.dto.CartCombinationDTO
import com.example.bycicleshop.core.mapper.DomainMapper
import org.springframework.stereotype.Component

@Component
class CartCombinationMapper : DomainMapper<CartCombination, CartCombinationDTO> {
    override fun toDTO(entity: CartCombination): CartCombinationDTO {
        return CartCombinationDTO(entity.id, entity.order, entity.combination)
    }

    override fun toEntity(dto: CartCombinationDTO): CartCombination {
        return CartCombination(dto.id, dto.order, dto.combination)
    }
}

