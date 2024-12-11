package com.example.bycicleshop.product.repository

import com.example.bycicleshop.product.model.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>