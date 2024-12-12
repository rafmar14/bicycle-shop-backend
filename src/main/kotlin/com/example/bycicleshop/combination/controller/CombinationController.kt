package com.example.bycicleshop.combination.controller

import com.example.bycicleshop.core.controller.AbstractController
import com.example.bycicleshop.core.dto.CombinationDTO
import com.example.bycicleshop.combination.model.Combination
import com.example.bycicleshop.combination.service.CombinationService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/combinations")
class CombinationController (
    private val combinationService: CombinationService
) : AbstractController<Combination, CombinationDTO>(combinationService) {
}