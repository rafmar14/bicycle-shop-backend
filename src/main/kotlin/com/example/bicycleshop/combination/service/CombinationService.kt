package com.example.bicycleshop.combination.service

import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.combination.repository.CombinationRepository
import com.example.bicycleshop.core.dto.CombinationDTO
import com.example.bicycleshop.core.service.AbstractJpaService
import com.example.bicycleshop.combination.mapper.CombinationMapper
import org.springframework.stereotype.Service

@Service
class CombinationService(
    private val combinationMapper: CombinationMapper,
    private val combinationRepository: CombinationRepository
) : AbstractJpaService<Combination, CombinationDTO>
    (combinationMapper, combinationRepository) {}