package com.example.bicycleshop.component.controller

import com.example.bicycleshop.category.model.Category
import com.example.bicycleshop.core.controller.AbstractController
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.component.service.ComponentService
import com.example.bicycleshop.core.exception.ControllerException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/components")
class ComponentController (
    private val componentService: ComponentService
) : AbstractController<Component, ComponentDTO>(componentService) {

    @GetMapping("/category/{idCategory}/product/{idProduct}")
    @ResponseStatus(HttpStatus.OK)
    open fun getByCategoryByProduct(@PathVariable idCategory : Long, @PathVariable idProduct : Long):
            List<ComponentDTO> =
        componentService
        .findByCategory(idCategory, idProduct) ?: throw
    ControllerException
        .ResourceNotFoundException("Resource not found")
}