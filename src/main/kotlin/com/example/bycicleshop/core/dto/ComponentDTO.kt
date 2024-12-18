package com.example.bicycleshop.core.dto

import java.math.BigDecimal

class ComponentDTO(
    val id: Long = 0,
    val name: String,
    val basePrice: BigDecimal
) {
}