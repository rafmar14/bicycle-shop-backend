package com.example.bycicleshop.cart.cartcomponent.model

import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.order.model.Order
import jakarta.persistence.*

@Entity
@Table(name = "cart_components")
class CartComponent (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @PrimaryKeyJoinColumn
    @OneToOne
    val order: Order,

    @PrimaryKeyJoinColumn
    @OneToOne
    val component: Component
){
}