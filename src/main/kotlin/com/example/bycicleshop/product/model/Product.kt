package com.example.bicycleshop.product.model

import jakarta.persistence.*

@Entity
@Table(name = "products")
class Product (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,
)