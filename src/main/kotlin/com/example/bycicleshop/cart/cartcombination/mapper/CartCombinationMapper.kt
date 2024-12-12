package com.example.bycicleshop.cart.cartcombination.mapper

import com.example.bycicleshop.cart.cartcombination.model.CartCombination
import com.example.bycicleshop.combination.mapper.CombinationMapper
import com.example.bycicleshop.core.dto.CartCombinationDTO
import com.example.bycicleshop.core.mapper.DomainMapper
import com.example.bycicleshop.order.mapper.OrderMapper
import org.springframework.stereotype.Component

@Component
class CartCombinationMapper(private val orderMapper: OrderMapper, private val combinationMapper: CombinationMapper) :
    DomainMapper<CartCombination, CartCombinationDTO> {

    override fun toDTO(entity: CartCombination): CartCombinationDTO {
        return CartCombinationDTO(entity.id,  orderMapper.toDTO(entity.order), combinationMapper.toDTO(entity
            .combination))
    }

    override fun toEntity(dto: CartCombinationDTO): CartCombination {
        return CartCombination(dto.id, orderMapper.toEntity(dto.order), combinationMapper.toEntity(dto.combination))
    }
}

