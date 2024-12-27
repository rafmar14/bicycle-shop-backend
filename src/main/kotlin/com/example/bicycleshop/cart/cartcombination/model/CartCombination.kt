package com.example.bicycleshop.cart.cartcombination.model

import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.order.model.Order
import jakarta.persistence.*

@Entity
@Table(name = "cart_combination")
class CartCombination (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @JoinColumn(name = "order_id")
    @OneToOne
    val order: Order,

    @JoinColumn(name = "combination_id")
    @OneToOne
    val combination: Combination
) {
}