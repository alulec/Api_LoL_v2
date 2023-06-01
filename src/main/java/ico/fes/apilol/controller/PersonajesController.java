package ico.fes.apilol.controller;

import ico.fes.apilol.model.Personaje;
import ico.fes.apilol.persistencia.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/peticiones")
public class PersonajesController {
    @Autowired
    private PersonajeRepository personajeRepo;

    @GetMapping("/{id}")
    public String getElement(@PathVariable int id, Model modelo){
        Personaje personaje = personajeRepo.findById(id).get();
        modelo.addAttribute("campeon", personaje);
        return "home";
    }

}


