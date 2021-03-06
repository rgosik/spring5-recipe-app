package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.dto.RecipeDto;
import com.springframework.spring5recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeDto saveRecipeDto(RecipeDto dto);
    RecipeDto findDtoById(Long id);
    void deleteById(Long id);
}
