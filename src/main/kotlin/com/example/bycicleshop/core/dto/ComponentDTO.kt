package com.example.bycicleshop.core.dto

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "components")
class ComponentDTO(
    val id: Long = 0,
    val name: String,
    val basePrice: BigDecimal
) {
}