package com.example.bicycleshop

import com.example.bicycleshop.core.dto.CategoryDTO
import com.example.bicycleshop.core.dto.CombinationDTO
import com.example.bicycleshop.core.dto.ComponentDTO
import com.example.bicycleshop.core.dto.ProductDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import java.math.BigDecimal


@SpringBootTest
class CombinationTest : AbstractCrudTest<CombinationDTO>() {

	@Autowired
	private val mockMvc: MockMvc? = null
	@Autowired
	private val objectMapper: ObjectMapper? = null

	override fun getBaseUrl(): String {
		return "/CombinationDTOs"
	}

	override fun createEntity(): CombinationDTO {
		return CombinationDTO(1,
			ComponentDTO(1, "Full-suspension", BigDecimal.valueOf(130L), CategoryDTO(1, "Frame type"),  ProductDTO
			(1, "Bicycle"),
			true),
			ComponentDTO(1, "Matte", BigDecimal.valueOf(140L), CategoryDTO(1, "Frame finish"),  ProductDTO
			(1, "Bicycle"),
			true),
			true,
			BigDecimal.valueOf(13))
	}

	override fun updateEntity(entity: CombinationDTO?): CombinationDTO {
		return CombinationDTO(1,
			ComponentDTO(1, "Full-suspension", BigDecimal.valueOf(130L), CategoryDTO(1, "Frame type"),  ProductDTO
				(1, "Bicycle"),
				true),
			ComponentDTO(1, "Matte", BigDecimal.valueOf(140L), CategoryDTO(1, "Frame finish"),  ProductDTO
				(1, "Bicycle"),
				true),
			false,
			BigDecimal.valueOf(0))
	}

}
