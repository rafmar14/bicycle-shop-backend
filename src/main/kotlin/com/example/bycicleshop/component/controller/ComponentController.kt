package com.example.bicycleshop.component.controller

import com.example.bicycleshop.core.controller.AbstractController
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.component.service.ComponentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/components")
class ComponentController (
    private val componentService: ComponentService
) : AbstractController<Component, ComponentDTO>(componentService) {
}