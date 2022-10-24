package com.jpaDemo.ejemplo.repository;

import com.jpaDemo.ejemplo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Mspeamos como repositorio
@Repository
//La interface extiende de JpaRepository (que maneja repositorios jpa) 
//en los parámetros <> deben ir: <clase a persistir, tipo de dato de su Id>
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
