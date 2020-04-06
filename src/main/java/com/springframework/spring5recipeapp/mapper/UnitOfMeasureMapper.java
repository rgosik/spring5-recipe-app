package com.springframework.spring5recipeapp.mapper;

import com.springframework.spring5recipeapp.dto.UnitOfMeasureDto;
import com.springframework.spring5recipeapp.model.UnitOfMeasure;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UnitOfMeasureMapper {

    UnitOfMeasureMapper INSTANCE = Mappers.getMapper(UnitOfMeasureMapper.class);

    UnitOfMeasureDto unitOfMeasureToUnitOfMeasureDto(UnitOfMeasure unitOfMeasure);
}
