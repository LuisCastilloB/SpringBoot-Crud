
package co.spring.helloworld.web;

import co.spring.helloworld.dao.PersonaDAO;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import co.spring.helloworld.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@Slf4j
public class ControladorIni {
    
    @Value("${index.messageApp}")
    private String messageApp;
    
    @Autowired
    private PersonaDAO personaDAO;
    
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
        
        var personas = personaDAO.findAll();
        
        model.addAttribute("personas", personas);
    
        return "index";
    }
}
