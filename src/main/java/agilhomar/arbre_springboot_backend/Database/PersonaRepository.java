package agilhomar.arbre_springboot_backend.Database;
import agilhomar.arbre_springboot_backend.Persona.Persona;
import org.springframework.data.repository.CrudRepository;
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
    Persona findByNameAndSurname1AndSurname2(String name, String surname1, String surname2);
}
