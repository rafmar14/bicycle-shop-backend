package com.example.bicycleshop.core.service

import com.example.bicycleshop.core.mapper.DomainMapper
import org.springframework.data.repository.CrudRepository

abstract class AbstractJpaService<T : Any, D : Any>(
    private val mapper: DomainMapper<T, D>,
    private val repository: CrudRepository<T, Long>
) {

    open fun findById(id: Long): D? = repository.findById(id).map(mapper::toDTO).orElse(null)

    open fun findAll(): List<D>? = repository.findAll().map(mapper::toDTO)

    open fun save(dto: D): D? = mapper.toDTO(repository.save(mapper.toEntity(dto)))

    open fun deleteById(id: Long) = repository.deleteById(id)
}