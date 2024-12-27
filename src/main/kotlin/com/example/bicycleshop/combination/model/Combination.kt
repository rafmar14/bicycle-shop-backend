package com.example.bicycleshop.combination.model

import com.example.bicycleshop.component.model.Component
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "combinations")
class Combination (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @OneToOne
    @JoinColumn(name = "compA_id")
    val compA: Component,

    @OneToOne
    @JoinColumn(name = "compB_id")
    val compB: Component,

    @Column(nullable = false)
    val compatible: Boolean,

    @Column(nullable = false)
    val priceAdjustment: BigDecimal
){
}