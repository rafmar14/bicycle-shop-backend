package com.example.bicycleshop.cart.cartcomponent.controller

import com.example.bicycleshop.cart.cartcomponent.model.CartComponent
import com.example.bicycleshop.cart.cartcomponent.service.CartComponentService
import com.example.bicycleshop.core.dto.CartComponentDTO
import com.example.bicycleshop.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cart/components")
class CartComponentController (
    private val cartComponentService: CartComponentService
) : AbstractController<CartComponent, CartComponentDTO> (cartComponentService) {
}