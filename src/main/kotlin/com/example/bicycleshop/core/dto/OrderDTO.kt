package com.example.bicycleshop.core.dto

import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.component.model.Component
import com.example.bicycleshop.customer.model.Customer

data class OrderDTO (
    val id: Long = 0,
    val customer: CustomerDTO,
    val components: List<ComponentDTO>,
    val combinations: List<CombinationDTO>,
    )