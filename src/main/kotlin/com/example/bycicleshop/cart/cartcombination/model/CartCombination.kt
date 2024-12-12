package com.example.bycicleshop.cart.cartcombination.model

import com.example.bycicleshop.combination.model.Combination
import com.example.bycicleshop.order.model.Order
import jakarta.persistence.*

class CartCombination (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @PrimaryKeyJoinColumn
    @OneToOne
    val order: Order,

    @PrimaryKeyJoinColumn
    @OneToOne
    val combination: Combination
) {
}