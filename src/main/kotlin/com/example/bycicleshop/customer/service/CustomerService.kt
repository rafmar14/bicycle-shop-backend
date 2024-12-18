package com.example.bicycleshop.customer.service

import com.example.bicycleshop.customer.model.Customer
import com.example.bicycleshop.customer.repository.CustomerRepository
import com.example.bicycleshop.core.dto.CustomerDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import com.example.bicycleshop.customer.mapper.CustomerMapper
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerMapper: CustomerMapper,
    private val customerRepository: CustomerRepository
) : AbstractJpaService<Customer, CustomerDTO>
    (customerMapper, customerRepository) {}