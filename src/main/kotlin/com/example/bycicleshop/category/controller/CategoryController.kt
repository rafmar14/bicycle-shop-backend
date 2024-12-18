package com.example.bicycleshop.category.controller

import com.example.bicycleshop.core.dto.CategoryDTO
import com.example.bicycleshop.category.model.Category
import com.example.bicycleshop.category.service.CategoryService
import com.example.bicycleshop.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController (
    private val categoryService: CategoryService
) : AbstractController<Category, CategoryDTO> (categoryService) {
}