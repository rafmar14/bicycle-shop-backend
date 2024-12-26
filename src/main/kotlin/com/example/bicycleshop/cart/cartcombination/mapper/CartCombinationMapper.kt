package com.example.bicycleshop.cart.cartcombination.mapper

import com.example.bicycleshop.cart.cartcombination.model.CartCombination
import com.example.bicycleshop.combination.mapper.CombinationMapper
import com.example.bicycleshop.core.dto.CartCombinationDTO
import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.order.mapper.OrderMapper
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

