package com.example.bicycleshop.category.service

import com.example.bicycleshop.core.dto.CategoryDTO
import com.example.bicycleshop.category.mapper.CategoryMapper
import com.example.bicycleshop.category.model.Category
import com.example.bicycleshop.category.repository.CategoryRepository
import com.example.bicycleshop.core.service.AbstractJpaService
import org.springframework.stereotype.Service

@Service
class CategoryService(
    private val categoryMapper: CategoryMapper,
    private val categoryRepository: CategoryRepository
) : AbstractJpaService<Category, CategoryDTO>
    (categoryMapper, categoryRepository) {}