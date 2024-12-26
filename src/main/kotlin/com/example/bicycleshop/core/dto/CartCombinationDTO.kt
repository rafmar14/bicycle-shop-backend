package com.example.bicycleshop.core.dto

import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.order.model.Order

data class CartCombinationDTO (
    val id: Long = 0,
    val order: OrderDTO,
    val combination: CombinationDTO
)