package com.example.bicycleshop.product.mapper

import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.product.model.Product
import com.example.bicycleshop.core.dto.ProductDTO
import org.springframework.stereotype.Component

@Component
class ProductMapper : DomainMapper<Product, ProductDTO> {
    override fun toDTO(entity: Product): ProductDTO {
        return ProductDTO(entity.id, entity.name)
    }

    override fun toEntity(dto: ProductDTO): Product {
        return Product(dto.id, dto.name)
    }
}