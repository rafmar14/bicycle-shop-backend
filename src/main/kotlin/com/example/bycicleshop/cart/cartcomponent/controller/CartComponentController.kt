package com.example.bycicleshop.cart.cartcomponent.controller

import com.example.bycicleshop.cart.cartcomponent.model.CartComponent
import com.example.bycicleshop.cart.cartcomponent.service.CartComponentService
import com.example.bycicleshop.core.dto.CartComponentDTO
import com.example.bycicleshop.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cart/components")
class CartComponentController (
    private val cartComponentService: CartComponentService
) : AbstractController<CartComponent, CartComponentDTO> (cartComponentService) {
}