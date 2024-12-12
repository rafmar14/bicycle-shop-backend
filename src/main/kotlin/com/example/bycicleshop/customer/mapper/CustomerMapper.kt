package com.example.bycicleshop.customer.mapper

import com.example.bycicleshop.core.mapper.DomainMapper
import com.example.bycicleshop.customer.model.Customer
import com.example.bycicleshop.core.dto.CustomerDTO
import org.springframework.stereotype.Component

@Component
class CustomerMapper : DomainMapper<Customer, CustomerDTO> {
    override fun toDTO(entity: Customer): CustomerDTO {
        return CustomerDTO(entity.id, entity.name, entity.email, entity.address)
    }

    override fun toEntity(dto: CustomerDTO): Customer {
        return Customer(dto.id, dto.name, dto.email, dto.address)
    }
}