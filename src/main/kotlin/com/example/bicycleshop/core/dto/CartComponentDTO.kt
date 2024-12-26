package com.example.bicycleshop.core.dto

import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.order.model.Order

data class CartComponentDTO (
    val id: Long = 0,
    val order: OrderDTO,
    val component: ComponentDTO
)