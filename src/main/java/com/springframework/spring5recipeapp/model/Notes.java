package com.springframework.spring5recipeapp.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes extends BaseEntity{

    @OneToOne
    @EqualsAndHashCode.Exclude private Recipe recipe;

    @Lob
    private String recipeNotes;

}
