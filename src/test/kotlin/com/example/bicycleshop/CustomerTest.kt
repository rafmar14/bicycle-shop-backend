package com.example.bicycleshop

import com.example.bicycleshop.core.dto.CustomerDTO
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc


@SpringBootTest
class CustomerTest : AbstractCrudTest<CustomerDTO>() {

	@Autowired
	private val mockMvc: MockMvc? = null
	@Autowired
	private val objectMapper: ObjectMapper? = null

	override fun getBaseUrl(): String {
		return "/customer"
	}

	override fun createEntity(): CustomerDTO {
		return CustomerDTO(1, "Marcus Smith", "marcus@bicycleshop.com","5 Cavendish Square, London")
	}

	override fun updateEntity(entity: CustomerDTO?): CustomerDTO {
		return CustomerDTO(1, "Marcus Rashford", "marcus@bicycleshop.com","6 Cavendish Square, London")
	}

}
