package com.example.bycicleshop.combination.service

import com.example.bycicleshop.combination.model.Combination
import com.example.bycicleshop.combination.repository.CombinationRepository
import com.example.bycicleshop.core.dto.CombinationDTO
import com.example.bycicleshop.core.service.AbstractJpaService
import com.example.bycicleshop.combination.mapper.CombinationMapper
import org.springframework.stereotype.Service

@Service
class CombinationService(
    private val combinationMapper: CombinationMapper,
    private val combinationRepository: CombinationRepository
) : AbstractJpaService<Combination, CombinationDTO>
    (combinationMapper, combinationRepository) {}