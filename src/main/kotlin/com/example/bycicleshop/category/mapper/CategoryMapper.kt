package com.example.bycicleshop.category.mapper

import com.example.bycicleshop.core.dto.CategoryDTO
import com.example.bycicleshop.category.model.Category
import com.example.bycicleshop.core.mapper.DomainMapper
import org.springframework.stereotype.Component

@Component
class CategoryMapper : DomainMapper<Category, CategoryDTO> {
    override fun toDTO(entity: Category): CategoryDTO {
        return CategoryDTO(entity.id, entity.name)
    }

    override fun toEntity(dto: CategoryDTO): Category {
        return Category(dto.id, dto.name)
    }
}

