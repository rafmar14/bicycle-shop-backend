package com.example.bycicleshop.cart.cartcomponent.repository

import com.example.bycicleshop.cart.cartcomponent.model.CartComponent
import org.springframework.data.repository.CrudRepository

interface CartComponentRepository : CrudRepository<CartComponent, Long>