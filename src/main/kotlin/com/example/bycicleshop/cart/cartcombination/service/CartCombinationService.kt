package com.example.bycicleshop.cart.cartcombination.service

import com.example.bycicleshop.cart.cartcombination.mapper.CartCombinationMapper
import com.example.bycicleshop.cart.cartcombination.model.CartCombination
import com.example.bycicleshop.cart.cartcombination.repository.CartCombinationRepository
import com.example.bycicleshop.core.dto.CartCombinationDTO
import com.example.bycicleshop.core.service.AbstractJpaService
import org.springframework.stereotype.Service

@Service
class CartCombinationService(
    private val cartCombinationMapper: CartCombinationMapper,
    private val cartCombinationRepository: CartCombinationRepository
) : AbstractJpaService<CartCombination, CartCombinationDTO>
    (cartCombinationMapper, cartCombinationRepository) {}