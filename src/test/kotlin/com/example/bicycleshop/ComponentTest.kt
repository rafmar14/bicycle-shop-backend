package com.example.bicycleshop

import com.example.bicycleshop.core.dto.CategoryDTO
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.core.dto.ProductDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import java.math.BigDecimal


@SpringBootTest
class ComponentTest : AbstractCrudTest<ComponentDTO>() {

	@Autowired
	private val mockMvc: MockMvc? = null
	@Autowired
	private val objectMapper: ObjectMapper? = null

	override fun getBaseUrl(): String {
		return "/components"
	}

	override fun createEntity(): ComponentDTO {
		return ComponentDTO(1, "Full-suspension", BigDecimal.valueOf(130L), CategoryDTO(1, "Frame type"),  ProductDTO
			(1, "Bicycle"),
			true)
	}

	override fun updateEntity(entity: ComponentDTO?): ComponentDTO {
		return ComponentDTO(1, "Diamond", BigDecimal.valueOf(140L), CategoryDTO(1, "Frame type"),  ProductDTO
			(1, "Bicycle"),
			true)
	}

}
