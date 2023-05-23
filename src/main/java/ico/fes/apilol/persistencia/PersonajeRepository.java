package ico.fes.apilol.persistencia;

import ico.fes.apilol.model.Personaje;
import org.springframework.data.repository.CrudRepository;

public interface PersonajeRepository extends CrudRepository<Personaje, Integer> {
}
