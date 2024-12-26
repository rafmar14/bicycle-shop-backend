package com.example.bicycleshop.core.dto

data class CustomerDTO (
    val id: Long = 0,
    val name: String,
    val email: String,
    val address: String,
)