package com.example.bycicleshop.customer.service

import com.example.bycicleshop.customer.model.Customer
import com.example.bycicleshop.customer.repository.CustomerRepository
import com.example.bycicleshop.core.dto.CustomerDTO
import com.example.bycicleshop.core.service.AbstractJpaService
import com.example.bycicleshop.customer.mapper.CustomerMapper
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerMapper: CustomerMapper,
    private val customerRepository: CustomerRepository
) : AbstractJpaService<Customer, CustomerDTO>
    (customerMapper, customerRepository) {}