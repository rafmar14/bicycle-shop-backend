package com.example.bycicleshop.component.controller

import com.example.bycicleshop.core.controller.AbstractController
import com.example.bycicleshop.core.dto.ComponentDTO
import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.component.service.ComponentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/components")
class ComponentController (
    private val componentService: ComponentService
) : AbstractController<Component, ComponentDTO>(componentService) {
}