package ico.fes.apilol.controller;

import ico.fes.apilol.model.Personaje;
import ico.fes.apilol.persistencia.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/personajes")
public class PersonajesController {
    @Autowired
    private PersonajeRepository personajeRepo;

    @GetMapping("/{id}")
    public Optional<Personaje> getElement(@PathVariable int id){
        return personajeRepo.findById(id);
    }

    @GetMapping("/")
    public Iterable<Personaje> getElements(){
        return personajeRepo.findAll();
    }

    // El metodo save puede hacer un insert y un update, si se le manda un id hara un update de existir el id,
    // en caso contrario (sin id o sin match con un id) hara un insert
    @PostMapping("/save")
    public Personaje saveElement(@RequestBody Personaje personaje){
        return personajeRepo.save(personaje);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteElement(@PathVariable int id){
        personajeRepo.deleteById(id);
    }
}


