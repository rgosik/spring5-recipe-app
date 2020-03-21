package com.springframework.spring5recipeapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category extends BaseEntity {

    private String description;

    @ManyToMany(mappedBy = "categories")
    @EqualsAndHashCode.Exclude private Set<Recipe> recipes;
}
