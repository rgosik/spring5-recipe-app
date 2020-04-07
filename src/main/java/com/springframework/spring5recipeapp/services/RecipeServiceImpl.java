package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.dto.RecipeDto;
import com.springframework.spring5recipeapp.mapper.RecipeMapper;
import com.springframework.spring5recipeapp.model.Recipe;
import com.springframework.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeMapper recipeMapper) {
        this.recipeRepository = recipeRepository;
        this.recipeMapper = recipeMapper;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I am in the service: getRecipes");
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }

    @Override
    public Recipe findById(Long id) {
        log.debug("I am in the service: findById");
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }

    @Override
    @Transactional
    public RecipeDto saveRecipeDto(RecipeDto dto) {
        Recipe detachedRecipe = recipeMapper.recipeDtoToRecipe(dto);

        Recipe savedRecipe = recipeRepository.save(detachedRecipe);
        log.debug("Saved Recipe: " + savedRecipe.getId());
        return recipeMapper.recipeToRecipeDto(savedRecipe);
    }

    @Override
    @Transactional
    public RecipeDto findDtoById(Long id) {
        log.debug("I am in the service: findDtoById");
        return recipeMapper.recipeToRecipeDto(findById(id));
    }

    @Override
    public void deleteById(Long id) {
        recipeRepository.deleteById(id);
    }


}