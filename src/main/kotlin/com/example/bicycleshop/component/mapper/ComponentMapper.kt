package com.example.bicycleshop.component.mapper

import com.example.bicycleshop.category.mapper.CategoryMapper
import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.product.mapper.ProductMapper

@org.springframework.stereotype.Component
class ComponentMapper(private val categoryMapper: CategoryMapper, private val productMapper: ProductMapper) : DomainMapper<com
    .example
    .bicycleshop
    .component.model.Component, ComponentDTO> {
    override fun toDTO(entity: com.example.bicycleshop.component.model.Component): ComponentDTO {
        return ComponentDTO(entity.id, entity.name, entity.basePrice, categoryMapper.toDTO(entity
            .category), productMapper.toDTO(entity.product), entity.available)
    }

    override fun toEntity(dto: ComponentDTO): Component {
        return Component(dto.id, dto.name, dto.basePrice, categoryMapper.toEntity(dto.category),
            productMapper.toEntity(dto.product), dto.available)
    }
}