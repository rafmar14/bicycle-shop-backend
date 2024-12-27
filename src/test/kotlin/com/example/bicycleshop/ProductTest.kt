package com.example.bicycleshop

import com.example.bicycleshop.core.dto.ProductDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc


@SpringBootTest
class ProductTest : AbstractCrudTest<ProductDTO>() {

	@Autowired
	private val mockMvc: MockMvc? = null
	@Autowired
	private val objectMapper: ObjectMapper? = null

	override fun getBaseUrl(): String {
		return "/products"
	}

	override fun createEntity(): ProductDTO {
		return ProductDTO(1, "Bicycle")
	}

	override fun updateEntity(entity: ProductDTO?): ProductDTO {
		return ProductDTO(1, "Car")
	}

}
