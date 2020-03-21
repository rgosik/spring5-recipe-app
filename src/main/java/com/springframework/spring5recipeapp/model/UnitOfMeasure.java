package com.springframework.spring5recipeapp.model;

import lombok.*;
import javax.persistence.Entity;

@Data
@Entity
public class UnitOfMeasure extends BaseEntity {

    private String description;

}
