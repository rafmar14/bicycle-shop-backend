package com.example.bicycleshop.component.service

import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.component.repository.ComponentRepository
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import com.example.bicycleshop.component.mapper.ComponentMapper
import org.springframework.stereotype.Service

@Service
class ComponentService(
    private val componentMapper: ComponentMapper,
    private val componentRepository: ComponentRepository
) : AbstractJpaService<Component, ComponentDTO>
    (componentMapper, componentRepository) {}