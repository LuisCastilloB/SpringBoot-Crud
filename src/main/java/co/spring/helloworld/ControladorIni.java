
package co.spring.helloworld;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@Slf4j
public class ControladorIni {
    
    @Value("${index.messageApp}")
    private String messageApp;
    
/*       
    @GetMapping("/hello")
    public String ini() {
        log.info("Ejecutando RestController");
        return "Hello World with Spring Boot!";
    }
 */  
    @GetMapping("/")
    public String index(Model model) {
        log.info("Ejecutando Spring MVC Controller");
        var message = "Hello World with Thymeleaf";
        model.addAttribute("message", message);
        model.addAttribute("messageApp", messageApp);
        
        List<Persona> personas = new ArrayList();
        
        var persona = new Persona();
        persona.setNombre("Luis");
        persona.setApellido("Castillo");
        persona.setEmail("lacb@gmail.com");
        persona.setTelefono("13212");
        
         var persona2 = new Persona();
        persona2.setNombre("Gindrid");
        persona2.setApellido("Archila");
        persona2.setEmail("gav@gmail.com");
        persona2.setTelefono("54454");
                
      //  personas.add(persona);
       // personas.add(persona2);
        model.addAttribute("personas",personas);
        
        return "index";
    }
}
