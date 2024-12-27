package com.example.bicycleshop.component.service

import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.component.repository.ComponentRepository
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import com.example.bicycleshop.component.mapper.ComponentMapper
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping

@Service
class ComponentService(
    private val componentMapper: ComponentMapper,
    private val componentRepository: ComponentRepository
) : AbstractJpaService<Component, ComponentDTO>
    (componentMapper, componentRepository) {
        open fun findByCategory(idCategory: Long, idProduct: Long): List<ComponentDTO>? = componentRepository
            .getByCategoryByProduct(idCategory, idProduct).map(componentMapper::toDTO)
    }