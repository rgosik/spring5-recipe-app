package com.springframework.spring5recipeapp.controllers;

import com.springframework.spring5recipeapp.model.Category;
import com.springframework.spring5recipeapp.model.UnitOfMeasure;
import com.springframework.spring5recipeapp.repositories.CategoryRepository;
import com.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is:" + categoryOptional.get().getId());
        System.out.println("UOM Id is:" + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
