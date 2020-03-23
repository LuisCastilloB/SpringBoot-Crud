package co.spring.helloworld.service;

import co.spring.helloworld.dao.PersonaDAO;
import co.spring.helloworld.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDAO personaDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>)personaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
         personaDAO.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona buscarPersona(Persona persona) {
       return personaDAO.findById(persona.getId()).orElse(null);
    }
}
