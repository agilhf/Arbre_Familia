package agilhomar.arbre_springboot_backend.Controller;
import agilhomar.arbre_springboot_backend.Database.PersonaRepository;
import agilhomar.arbre_springboot_backend.Persona.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.sql.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api/v1/arbre")
public class PersonsController {
    @Autowired
    public PersonaRepository personaRepository;
    @PostMapping(path = "/addPerson")
    public @ResponseBody String addPerson (@RequestParam String Name, @RequestParam String Surname1, @RequestParam String Surname2,
                                    @RequestParam Persona Mother, @RequestParam Persona Father, @RequestParam Date DateOfBirth, ){return "Saved";}
}
