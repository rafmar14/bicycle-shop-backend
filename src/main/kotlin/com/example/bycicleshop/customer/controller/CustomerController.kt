package com.example.bicycleshop.customer.controller

import com.example.bicycleshop.core.controller.AbstractController
import com.example.bicycleshop.core.dto.CustomerDTO
import com.example.bicycleshop.customer.model.Customer
import com.example.bicycleshop.customer.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController (
    private val customerService: CustomerService
) : AbstractController<Customer, CustomerDTO>(customerService) {
}