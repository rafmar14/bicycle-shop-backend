package com.example.bicycleshop.component.model

import com.example.bicycleshop.category.model.Category
import com.example.bicycleshop.product.model.Product
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "components")
class Component(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val basePrice: BigDecimal,

    @JoinColumn(name = "category_id")
    @OneToOne
    val category: Category,

    @JoinColumn(name = "product_id")
    @OneToOne
    val product: Product,

    @Column(nullable = false)
    val available: Boolean
) {
}