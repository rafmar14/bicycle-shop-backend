package com.example.bycicleshop.core.dto

import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.order.model.Order

data class CartComponentDTO (
    val id: Long = 0,
    val order: OrderDTO,
    val component: ComponentDTO
)