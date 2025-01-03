package com.example.bicycleshop.core.dto

import com.example.bicycleshop.component.model.Component
import jakarta.persistence.*
import java.math.BigDecimal

data class CombinationDTO (
    val id: Long = 0,
    val compA: ComponentDTO,
    val compB: ComponentDTO,
    val compatible: Boolean,
    val priceAdjustment: BigDecimal
)