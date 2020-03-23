
package co.spring.helloworld.web;

import co.spring.helloworld.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

//@RestController
@Controller
@Slf4j
public class ControladorIni {
    
    @Value("${index.messageApp}")
    private String messageApp;
    
    @Autowired
    private PersonaService personaService;
    
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
        
        var personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        
        return "index";
    }
}
