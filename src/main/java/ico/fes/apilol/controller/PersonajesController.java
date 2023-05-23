package ico.fes.apilol.controller;

import ico.fes.apilol.model.Personaje;
import ico.fes.apilol.persistencia.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/lol/personaje")
public class PersonajesController {
    @Autowired
    private PersonajeRepository personajeRepo;

    @GetMapping("/{id}")
    public Optional<Personaje> getPersonaje(@PathVariable int id){
        return personajeRepo.findById(id);
    }


}

