package com.example.bycicleshop.core.dto

data class CustomerDTO (
    val id: Long = 0,
    val name: String,
    val email: String,
    val address: String,
)