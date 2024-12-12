package com.example.bycicleshop.component.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "components")
class Component(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val basePrice: BigDecimal
) {
}