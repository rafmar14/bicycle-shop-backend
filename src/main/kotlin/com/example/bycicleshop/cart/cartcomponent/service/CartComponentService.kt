package com.example.bycicleshop.cart.cartcomponent.service

import com.example.bycicleshop.cart.cartcomponent.mapper.CartComponentMapper
import com.example.bycicleshop.cart.cartcomponent.model.CartComponent
import com.example.bycicleshop.core.dto.CartComponentDTO
import com.example.bycicleshop.cart.cartcomponent.repository.CartComponentRepository
import com.example.bycicleshop.core.service.AbstractJpaService
import org.springframework.stereotype.Service

@Service
class CartComponentService(
    private val cartComponentMapper: CartComponentMapper,
    private val cartComponentRepository: CartComponentRepository
) : AbstractJpaService<CartComponent, CartComponentDTO>
    (cartComponentMapper, cartComponentRepository) {}