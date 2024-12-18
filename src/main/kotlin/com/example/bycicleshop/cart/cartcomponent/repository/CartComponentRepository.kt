package com.example.bicycleshop.cart.cartcomponent.repository

import com.example.bicycleshop.cart.cartcomponent.model.CartComponent
import org.springframework.data.repository.CrudRepository

interface CartComponentRepository : CrudRepository<CartComponent, Long>