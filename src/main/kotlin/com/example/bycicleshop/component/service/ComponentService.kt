package com.example.bycicleshop.component.service

import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.component.repository.ComponentRepository
import com.example.bycicleshop.core.dto.ComponentDTO
import com.example.bycicleshop.core.service.AbstractJpaService
import com.example.bycicleshop.component.mapper.ComponentMapper
import org.springframework.stereotype.Service

@Service
class ComponentService(
    private val componentMapper: ComponentMapper,
    private val componentRepository: ComponentRepository
) : AbstractJpaService<Component, ComponentDTO>
    (componentMapper, componentRepository) {}