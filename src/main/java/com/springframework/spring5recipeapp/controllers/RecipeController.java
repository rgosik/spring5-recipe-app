package com.springframework.spring5recipeapp.controllers;

import com.springframework.spring5recipeapp.dto.RecipeDto;
import com.springframework.spring5recipeapp.model.Recipe;
import com.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    @RequestMapping("/{id}/show")
    public String showById(@PathVariable String id, Model model){

        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "recipe/show";
    }

    @GetMapping
    @RequestMapping("/new")
    public String newRecipe(Model model) {
        model.addAttribute("recipe", new RecipeDto());

        return "recipe/form";
    }

    @GetMapping
    @RequestMapping("/{id}/update")
    public String updateRecipe(@PathVariable String id, Model model) {

        model.addAttribute("recipe", recipeService.findDtoById(Long.valueOf(id)));

        return "recipe/form";
    }

    @GetMapping
    @RequestMapping("/{id}/delete")
    public String deleteRecipe(@PathVariable String id){
        log.debug("Deleting id: " + id);

        recipeService.deleteById(Long.valueOf(id));

        return "redirect:/";
    }

    @PostMapping
    public String saveOrUpdate(@ModelAttribute RecipeDto dto) {
        log.debug("Saving or updating: " + dto.getId());

        RecipeDto savedDto = recipeService.saveRecipeDto(dto);

        return "redirect:/recipe/" + savedDto.getId() + "/show";
    }
}
