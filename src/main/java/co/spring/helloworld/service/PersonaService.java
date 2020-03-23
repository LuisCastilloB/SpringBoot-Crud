
package co.spring.helloworld.service;

import co.spring.helloworld.domain.Persona;
import java.util.List;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar (Persona persona);
    
    public Persona buscarPersona(Persona persona);
    
    
}
