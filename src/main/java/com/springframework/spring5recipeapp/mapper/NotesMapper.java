package com.springframework.spring5recipeapp.mapper;

import com.springframework.spring5recipeapp.dto.NotesDto;
import com.springframework.spring5recipeapp.model.Notes;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotesMapper {

    NotesMapper INSTANCE = Mappers.getMapper(NotesMapper.class);

    NotesDto notesToNotesDto(Notes notes);
}
