package com.jpaDemo.ejemplo.DTO;

import com.jpaDemo.ejemplo.model.Persona;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Persona convertirAPersona(PersonaDTO personaDTO);
}
