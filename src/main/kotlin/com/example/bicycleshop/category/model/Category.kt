package com.example.bicycleshop.category.model

import com.example.bicycleshop.component.model.Component
import jakarta.persistence.*

@Entity
@Table(name = "categories")
class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String
)