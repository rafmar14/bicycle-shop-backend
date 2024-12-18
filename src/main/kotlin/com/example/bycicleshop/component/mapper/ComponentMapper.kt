package com.example.bicycleshop.component.mapper

import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.core.dto.ComponentDTO

@org.springframework.stereotype.Component
class ComponentMapper : DomainMapper<com.example.bicycleshop.component.model.Component, ComponentDTO> {
    override fun toDTO(entity: com.example.bicycleshop.component.model.Component): ComponentDTO {
        return ComponentDTO(entity.id, entity.name, entity.basePrice)
    }

    override fun toEntity(dto: ComponentDTO): Component {
        return Component(dto.id, dto.name, dto.basePrice)
    }
}