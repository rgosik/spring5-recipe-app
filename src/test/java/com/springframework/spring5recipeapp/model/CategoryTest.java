package com.springframework.spring5recipeapp.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getDescription() {
        String description = "Test";

        category.setDescription(description);

        assertEquals(category.getDescription(), "Test");
    }

    @Test
    void getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());

        category.setRecipes(recipes);

        assertSame(recipes, category.getRecipes());
    }
}