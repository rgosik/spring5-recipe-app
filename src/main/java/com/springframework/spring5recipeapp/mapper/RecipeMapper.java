package com.springframework.spring5recipeapp.mapper;

import com.springframework.spring5recipeapp.dto.RecipeDto;
import com.springframework.spring5recipeapp.model.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {

    RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    RecipeDto recipeToRecipeDto(Recipe recipe);
    Recipe recipeDtoToRecipe(RecipeDto recipeDto);
}
