package com.example.bicycleshop.cart.cartcomponent.model

import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.order.model.Order
import jakarta.persistence.*

@Entity
@Table(name = "cart_components")
class CartComponent (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @JoinColumn(name = "order_id")
    @OneToOne
    val order: Order,

    @JoinColumn(name = "component_id")
    @OneToOne
    val component: Component
){
}