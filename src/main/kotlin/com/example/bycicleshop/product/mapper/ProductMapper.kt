package com.example.bycicleshop.product.mapper

import com.example.bycicleshop.core.mapper.DomainMapper
import com.example.bycicleshop.product.model.Product
import com.example.bycicleshop.core.dto.ProductDTO
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