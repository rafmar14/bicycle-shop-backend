package com.example.bycicleshop.customer.controller

import com.example.bycicleshop.core.controller.AbstractController
import com.example.bycicleshop.core.dto.CustomerDTO
import com.example.bycicleshop.customer.model.Customer
import com.example.bycicleshop.customer.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController (
    private val customerService: CustomerService
) : AbstractController<Customer, CustomerDTO>(customerService) {
}