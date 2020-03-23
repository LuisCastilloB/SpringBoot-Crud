
package co.spring.helloworld.dao;

import co.spring.helloworld.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}
