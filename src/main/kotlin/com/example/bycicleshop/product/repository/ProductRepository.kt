package com.example.bicycleshop.product.repository

import com.example.bicycleshop.product.model.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>