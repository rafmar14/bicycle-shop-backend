package com.example.bycicleshop.component.mapper

import com.example.bycicleshop.core.mapper.DomainMapper
import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.core.dto.ComponentDTO

@org.springframework.stereotype.Component
class ComponentMapper : DomainMapper<com.example.bycicleshop.component.model.Component, ComponentDTO> {
    override fun toDTO(entity: com.example.bycicleshop.component.model.Component): ComponentDTO {
        return ComponentDTO(entity.id, entity.name, entity.basePrice)
    }

    override fun toEntity(dto: ComponentDTO): Component {
        return Component(dto.id, dto.name, dto.basePrice)
    }
}