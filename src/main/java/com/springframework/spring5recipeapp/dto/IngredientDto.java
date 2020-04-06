package com.springframework.spring5recipeapp.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class IngredientDto {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureDto uom;

}
