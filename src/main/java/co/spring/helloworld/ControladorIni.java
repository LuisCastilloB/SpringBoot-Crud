
package co.spring.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorIni {
       
    @GetMapping("/hello")
    public String ini() {
        log.info("Ejecutando RestController");
        return "Hello World with Spring Boot!";
    }
}
