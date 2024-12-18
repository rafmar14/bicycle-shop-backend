package com.example.bicycleshop.component.repository

import com.example.bicycleshop.component.model.Component
import org.springframework.data.repository.CrudRepository

interface ComponentRepository : CrudRepository<Component, Long>