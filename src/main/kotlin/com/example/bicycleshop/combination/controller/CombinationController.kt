package com.example.bicycleshop.combination.controller

import com.example.bicycleshop.core.controller.AbstractController
import com.example.bicycleshop.core.dto.CombinationDTO
import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.combination.service.CombinationService
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/combinations")
class CombinationController (
    private val combinationService: CombinationService
) : AbstractController<Combination, CombinationDTO>(combinationService) {
}