package com.example.bycicleshop.combination.model

import com.example.bycicleshop.component.model.Component
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "combinations")
class Combination (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @PrimaryKeyJoinColumn
    @OneToOne
    val compA: Component,

    @PrimaryKeyJoinColumn
    @OneToOne
    val compB: Component,

    @Column(nullable = false)
    val compatible: Boolean,

    @Column(nullable = false)
    val priceAdjustment: BigDecimal
){
}