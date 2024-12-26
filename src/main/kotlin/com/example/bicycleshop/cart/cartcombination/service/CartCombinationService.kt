package com.example.bicycleshop.cart.cartcombination.service

import com.example.bicycleshop.cart.cartcombination.mapper.CartCombinationMapper
import com.example.bicycleshop.cart.cartcombination.model.CartCombination
import com.example.bicycleshop.cart.cartcombination.repository.CartCombinationRepository
import com.example.bicycleshop.core.dto.CartCombinationDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import org.springframework.stereotype.Service

@Service
class CartCombinationService(
    private val cartCombinationMapper: CartCombinationMapper,
    private val cartCombinationRepository: CartCombinationRepository
) : AbstractJpaService<CartCombination, CartCombinationDTO>
    (cartCombinationMapper, cartCombinationRepository) {}