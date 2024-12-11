package com.example.bycicleshop.product.service

import com.example.bycicleshop.product.model.Product
import com.example.bycicleshop.product.repository.ProductRepository
import com.example.bycicleshop.core.dto.ProductDTO
import com.example.bycicleshop.core.service.AbstractJpaService
import com.example.bycicleshop.product.mapper.ProductMapper
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productMapper: ProductMapper,
    private val productRepository: ProductRepository
) : AbstractJpaService<Product, ProductDTO>
    (productMapper, productRepository) {}