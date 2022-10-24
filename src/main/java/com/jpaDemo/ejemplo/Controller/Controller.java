package com.jpaDemo.ejemplo.Controller;

import com.jpaDemo.ejemplo.model.Persona;
import com.jpaDemo.ejemplo.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class Controller {
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/traer")
    public List<Persona> getPersonas(){
    return interPersona.getPersonas();
    }
    
    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona perso){
    interPersona.savePersona(perso);
    return "La persona se guardó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
    interPersona.deletePersona(id);
    return "La persona se eliminó correctamente";
    }
    
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam ("apellido") String nuevoApellido,
            @RequestParam ("edad") int nuevaEdad){
        //Busco a la persona en cuestión
    Persona perso = interPersona.findPersona(id);
    
    //edito los campos de esa persona
    perso.setNombre(nuevoNombre);
    perso.setApellido(nuevoApellido);
    perso.setEdad(nuevaEdad);
    
    interPersona.savePersona(perso);
    return perso;
    }
}
