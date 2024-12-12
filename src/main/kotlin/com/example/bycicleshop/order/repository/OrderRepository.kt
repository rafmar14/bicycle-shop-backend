package com.example.bycicleshop.order.repository

import com.example.bycicleshop.order.model.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long>