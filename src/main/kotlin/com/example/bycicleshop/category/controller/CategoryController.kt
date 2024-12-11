package com.example.bycicleshop.category.controller

import com.example.bycicleshop.core.dto.CategoryDTO
import com.example.bycicleshop.category.model.Category
import com.example.bycicleshop.category.service.CategoryService
import com.example.bycicleshop.core.controller.AbstractController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController (
    private val categoryService: CategoryService
) : AbstractController<Category, CategoryDTO> (categoryService) {
}