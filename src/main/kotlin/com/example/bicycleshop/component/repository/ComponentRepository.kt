package com.example.bicycleshop.component.repository

import com.example.bicycleshop.component.model.Component
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ComponentRepository : CrudRepository<Component, Long> {
    @Query("Select c from Component c where c.category.id = :idCategory and c.product.id = :idProduct and c" +
            ".available=true")
    fun getByCategoryByProduct(idCategory: Long, idProduct: Long) : List<Component>
}