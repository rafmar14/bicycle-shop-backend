package com.example.bicycleshop.product.service

import com.example.bicycleshop.product.model.Product
import com.example.bicycleshop.product.repository.ProductRepository
import com.example.bicycleshop.core.dto.ProductDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import com.example.bicycleshop.product.mapper.ProductMapper
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productMapper: ProductMapper,
    private val productRepository: ProductRepository
) : AbstractJpaService<Product, ProductDTO>
    (productMapper, productRepository) {}