package com.example.bycicleshop.category.repository

import com.example.bycicleshop.category.model.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<Category, Long>