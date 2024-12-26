package com.example.bicycleshop.customer.repository

import com.example.bicycleshop.customer.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long>