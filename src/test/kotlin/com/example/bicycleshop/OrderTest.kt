package com.example.bicycleshop

import com.example.bicycleshop.core.dto.*
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import java.math.BigDecimal


@SpringBootTest
class OrderTest : AbstractCrudTest<OrderDTO>() {

	@Autowired
	private val mockMvc: MockMvc? = null
	@Autowired
	private val objectMapper: ObjectMapper? = null

	override fun getBaseUrl(): String {
		return "/products"
	}

	override fun createEntity(): OrderDTO {
		return OrderDTO(1, CustomerDTO(1, "Marcus Rashford", "marcus@bicycleshop.com","6 Cavendish Square, London"),
			listOf(), listOf())
	}

	override fun updateEntity(entity: OrderDTO?): OrderDTO {
		return OrderDTO(1, CustomerDTO(1, "Marcus Rashford", "marcus@bicycleshop.com","6 Cavendish Square, London"),
			listOf(
				ComponentDTO(
					1,
					"Full-suspension",
					BigDecimal.valueOf(130L),
					CategoryDTO(1, "Frame type"),
					ProductDTO
						(1, "Bicycle"),
					true
				)
			),
			listOf(
				CombinationDTO(1,
				ComponentDTO(1, "Full-suspension", BigDecimal.valueOf(130L), CategoryDTO(1, "Frame type"),  ProductDTO
					(1, "Bicycle"),
					true),
				ComponentDTO(1, "Matte", BigDecimal.valueOf(140L), CategoryDTO(1, "Frame finish"),  ProductDTO
					(1, "Bicycle"),
					true),
				false,
				BigDecimal.valueOf(0)
			)))
	}

}
