package com.example.bicycleshop.order.model

import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.customer.model.Customer
import jakarta.persistence.*

@Entity
@Table(name = "orders")
class Order (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    val customer: Customer,

    @OneToMany
    @JoinTable(
        name = "cart_components",
        joinColumns = [JoinColumn(name = "component_id")],
        inverseJoinColumns = [JoinColumn(name = "order_id")]
    )
    val components: List<Component>,

    @OneToMany
    @JoinTable(
        name = "cart_combination",
        joinColumns = [JoinColumn(name = "combination_id")],
        inverseJoinColumns = [JoinColumn(name = "order_id")]
    )
    val combinations: List<Combination>
    ) {
}