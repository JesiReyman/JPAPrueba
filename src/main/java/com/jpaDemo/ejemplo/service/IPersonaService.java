/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jpaDemo.ejemplo.service;

import com.jpaDemo.ejemplo.DTO.PersonaDTO;
import com.jpaDemo.ejemplo.model.Persona;
import java.util.List;

/**
 *
 * @author Jesica
 */
public interface IPersonaService {
    //Método para traer todas las personas
    public List<Persona> getPersonas();
    
    //Dar de alta una persona
    public void savePersona(Persona perso);
    
    //Borrar una persona
    public void deletePersona(Long id);
    
    //Encontrar una persona
    public Persona findPersona(Long id);

    //Editar persona
    public void editarPersona(PersonaDTO personaDTO);
}
