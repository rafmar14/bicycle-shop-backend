package com.example.bycicleshop.core.dto

import com.example.bycicleshop.combination.model.Combination
import com.example.bycicleshop.component.model.Component
import com.example.bycicleshop.customer.model.Customer

data class OrderDTO (
    val id: Long = 0,
    val customer: CustomerDTO,
    val components: List<ComponentDTO>,
    val combinations: List<CombinationDTO>,
    )