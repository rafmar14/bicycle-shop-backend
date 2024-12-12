package com.example.bycicleshop.order.model

import com.example.bycicleshop.combination.model.Combination
import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.customer.model.Customer
import jakarta.persistence.*

@Entity
@Table(name = "orders")
class Order (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @PrimaryKeyJoinColumn
    @OneToOne
    val customer: Customer,

    @ManyToMany
    @JoinTable(
        name = "cart_components",
        joinColumns = [JoinColumn(name = "component_id")],
        inverseJoinColumns = [JoinColumn(name = "order_id")]
    )
    val components: List<Component>,

    @ManyToMany
    @JoinTable(
        name = "cart_combination",
        joinColumns = [JoinColumn(name = "combination_id")],
        inverseJoinColumns = [JoinColumn(name = "order_id")]
    )
    val combinations: List<Combination>,
    ) {
}