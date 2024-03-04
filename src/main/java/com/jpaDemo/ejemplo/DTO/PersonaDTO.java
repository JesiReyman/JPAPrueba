package com.jpaDemo.ejemplo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}
