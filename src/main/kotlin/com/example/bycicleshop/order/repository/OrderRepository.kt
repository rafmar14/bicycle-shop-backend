package com.example.bicycleshop.order.repository

import com.example.bicycleshop.order.model.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<Order, Long>