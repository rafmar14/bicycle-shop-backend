package com.example.bicycleshop.cart.cartcomponent.service

import com.example.bicycleshop.cart.cartcomponent.mapper.CartComponentMapper
import com.example.bicycleshop.cart.cartcomponent.model.CartComponent
import com.example.bicycleshop.core.dto.CartComponentDTO
import com.example.bicycleshop.cart.cartcomponent.repository.CartComponentRepository
import com.example.bicycleshop.core.service.AbstractJpaService
import org.springframework.stereotype.Service

@Service
class CartComponentService(
    private val cartComponentMapper: CartComponentMapper,
    private val cartComponentRepository: CartComponentRepository
) : AbstractJpaService<CartComponent, CartComponentDTO>
    (cartComponentMapper, cartComponentRepository) {}