package com.example.bicycleshop.product.controller

import com.example.bicycleshop.core.controller.AbstractController
import com.example.bicycleshop.core.dto.ProductDTO
import com.example.bicycleshop.product.model.Product
import com.example.bicycleshop.product.service.ProductService
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/products")
class ProductController (
    private val productService: ProductService
) : AbstractController<Product, ProductDTO>(productService) {
}