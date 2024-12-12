package com.example.bycicleshop.core.controller

import com.example.bycicleshop.core.exception.ControllerException
import com.example.bycicleshop.core.service.AbstractJpaService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

abstract class AbstractController<T : Any, D : Any>(
    private val service: AbstractJpaService<T, D>
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    open fun getAll(): List<D> = service.findAll() ?: throw ControllerException
        .ResourceNotFoundException("Resource not found")

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    open fun getById(@PathVariable id: Long): D? = service.findById(id) ?: throw ControllerException
        .ResourceNotFoundException("Resource not found")

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    open fun create(@RequestBody entity: D): D = service.save(entity) ?: throw ControllerException
        .ResourceNotFoundException("Resource not found")

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    open fun update(@RequestBody entity: D): D = service.save(entity) ?: throw ControllerException
        .BadRequestException("Bad Request")

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    open fun delete(@PathVariable id: Long) = service.deleteById(id)
}