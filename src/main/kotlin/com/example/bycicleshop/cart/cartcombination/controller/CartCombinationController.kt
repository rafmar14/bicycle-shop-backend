package com.example.bycicleshop.cart.cartcombination.controller

import com.example.bycicleshop.cart.cartcombination.model.CartCombination
import com.example.bycicleshop.core.dto.CartCombinationDTO
import com.example.bycicleshop.cart.cartcombination.service.CartCombinationService
import com.example.bycicleshop.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cart/combination")
class CartCombinationController (
    private val cartCombinationService: CartCombinationService
) : AbstractController<CartCombination, CartCombinationDTO> (cartCombinationService) {
}