package com.springframework.spring5recipeapp.mapper;

import com.springframework.spring5recipeapp.dto.IngredientDto;
import com.springframework.spring5recipeapp.model.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper {

    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

    IngredientDto ingredientToIngredientDto(Ingredient ingredient);
}
