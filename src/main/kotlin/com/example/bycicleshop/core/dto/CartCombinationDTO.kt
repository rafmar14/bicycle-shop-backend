package com.example.bycicleshop.core.dto

import com.example.bycicleshop.combination.model.Combination
import com.example.bycicleshop.order.model.Order

data class CartCombinationDTO (
    val id: Long = 0,
    val order: Order,
    val combination: Combination
)