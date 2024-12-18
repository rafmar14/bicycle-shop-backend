package com.example.bicycleshop.core.mapper

interface DomainMapper <T,D> {
    fun toDTO (entity: T) : D
    fun toEntity (dto: D) : T
}