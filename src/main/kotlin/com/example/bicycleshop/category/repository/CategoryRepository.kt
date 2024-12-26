package com.example.bicycleshop.category.repository

import com.example.bicycleshop.category.model.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<Category, Long>