package com.example.bicycleshop.combination.mapper

import com.example.bicycleshop.core.mapper.DomainMapper
import com.example.bicycleshop.combination.model.Combination
import com.example.bicycleshop.component.mapper.ComponentMapper
import com.example.bicycleshop.core.dto.CombinationDTO
import org.springframework.stereotype.Component

@Component
class CombinationMapper(private val componentMapper: ComponentMapper) : DomainMapper<Combination, CombinationDTO> {
    override fun toDTO(entity: Combination): CombinationDTO {
        return CombinationDTO(entity.id, componentMapper.toDTO(entity.compA), componentMapper.toDTO(entity.compB),
            entity.compatible, entity
            .priceAdjustment)
    }

    override fun toEntity(dto: CombinationDTO): Combination {
        return Combination(dto.id, componentMapper.toEntity(dto.compA), componentMapper.toEntity(dto.compB), dto
            .compatible, dto.priceAdjustment)
    }
}