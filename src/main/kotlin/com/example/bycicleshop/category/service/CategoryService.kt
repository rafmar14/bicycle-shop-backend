package com.example.bycicleshop.category.service

import com.example.bycicleshop.core.dto.CategoryDTO
import com.example.bycicleshop.category.mapper.CategoryMapper
import com.example.bycicleshop.category.model.Category
import com.example.bycicleshop.category.repository.CategoryRepository
import com.example.bycicleshop.core.service.AbstractJpaService
import org.springframework.stereotype.Service

@Service
class CategoryService(
    private val categoryMapper: CategoryMapper,
    private val categoryRepository: CategoryRepository
) : AbstractJpaService<Category, CategoryDTO>
    (categoryMapper, categoryRepository) {}