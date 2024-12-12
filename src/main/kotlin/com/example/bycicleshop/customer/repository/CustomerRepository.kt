package com.example.bycicleshop.customer.repository

import com.example.bycicleshop.customer.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long>