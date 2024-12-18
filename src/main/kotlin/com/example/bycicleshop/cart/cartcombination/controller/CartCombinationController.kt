package com.example.bicycleshop.cart.cartcombination.controller

import com.example.bicycleshop.cart.cartcombination.model.CartCombination
import com.example.bicycleshop.core.dto.CartCombinationDTO
import com.example.bicycleshop.cart.cartcombination.service.CartCombinationService
import com.example.bicycleshop.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cart/combination")
class CartCombinationController (
    private val cartCombinationService: CartCombinationService
) : AbstractController<CartCombination, CartCombinationDTO> (cartCombinationService) {
}