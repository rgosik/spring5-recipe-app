package com.springframework.spring5recipeapp.dto;

import com.springframework.spring5recipeapp.model.Difficulty;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class RecipeDto {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] image;
    private Set<IngredientDto> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private NotesDto notes;
    private Set<CategoryDto> categories = new HashSet<>();

}