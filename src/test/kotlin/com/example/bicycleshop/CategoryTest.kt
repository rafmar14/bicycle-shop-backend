package com.example.bicycleshop

import com.example.bicycleshop.core.dto.CategoryDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc


@SpringBootTest
class CategoryTest : AbstractCrudTest<CategoryDTO>() {

	@Autowired
	private val mockMvc: MockMvc? = null
	@Autowired
	private val objectMapper: ObjectMapper? = null

	override fun getBaseUrl(): String {
		return "/categories"
	}

	override fun createEntity(): CategoryDTO {
		return CategoryDTO(1, "Frame-type")
	}

	override fun updateEntity(entity: CategoryDTO?): CategoryDTO {
		return CategoryDTO(1, "Frame-finish")
	}

}
