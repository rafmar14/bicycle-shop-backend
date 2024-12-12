package com.example.bycicleshop.customer.model

import jakarta.persistence.*

@Entity
@Table(name = "customers")
class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val address: String,
) {
}