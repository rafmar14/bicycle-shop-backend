package com.example.bycicleshop.core.dto

import com.example.bycicleshop.component.model.Component
import jakarta.persistence.*
import java.math.BigDecimal

data class CombinationDTO (
    val id: Long = 0,
    val compA: Component,
    val compB: Component,
    val compatible: Boolean,
    val priceAdjustment: BigDecimal
)