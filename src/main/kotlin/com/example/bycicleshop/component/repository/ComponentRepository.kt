package com.example.bycicleshop.component.repository

import com.example.bycicleshop.component.model.Component
import org.springframework.data.repository.CrudRepository

interface ComponentRepository : CrudRepository<Component, Long>