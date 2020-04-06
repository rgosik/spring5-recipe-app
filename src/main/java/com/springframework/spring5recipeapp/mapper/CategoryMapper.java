package com.springframework.spring5recipeapp.mapper;

import com.springframework.spring5recipeapp.dto.CategoryDto;
import com.springframework.spring5recipeapp.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto categoryToCategoryDto(Category category);
}
