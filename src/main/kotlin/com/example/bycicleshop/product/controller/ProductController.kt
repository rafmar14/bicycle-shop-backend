package com.example.bycicleshop.product.controller

import com.example.bycicleshop.core.controller.AbstractController
import com.example.bycicleshop.core.dto.ProductDTO
import com.example.bycicleshop.product.model.Product
import com.example.bycicleshop.product.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController (
    private val productService: ProductService
) : AbstractController<Product, ProductDTO>(productService) {
}