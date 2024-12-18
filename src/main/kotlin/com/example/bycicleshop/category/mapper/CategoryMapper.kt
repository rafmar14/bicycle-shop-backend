package com.example.bicycleshop.category.mapper

import com.example.bicycleshop.core.dto.CategoryDTO
import com.example.bicycleshop.category.model.Category
import com.example.bicycleshop.core.mapper.DomainMapper
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

