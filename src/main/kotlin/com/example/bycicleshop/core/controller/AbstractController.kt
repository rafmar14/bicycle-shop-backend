package com.example.bycicleshop.core.controller

import com.example.bycicleshop.core.service.AbstractJpaService
import org.springframework.web.bind.annotation.*

abstract class AbstractController<T : Any, D : Any>(
    private val service: AbstractJpaService<T, D>
) {

    @GetMapping
    open fun getAll(): List<D> = service.findAll()

    @GetMapping("/{id}")
    open fun getById(@PathVariable id: Long): D? = service.findById(id)

    @PostMapping
    open fun create(@RequestBody entity: D): D = service.save(entity)

    @PutMapping
    open fun update(@RequestBody entity: D): D = service.save(entity)

    @DeleteMapping("/{id}")
    open fun delete(@PathVariable id: Long) = service.deleteById(id)
}