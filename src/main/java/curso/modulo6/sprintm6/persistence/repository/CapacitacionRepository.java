package curso.modulo6.sprintm6.persistence.repository;


import curso.modulo6.sprintm6.persistence.crud.ICapacitacionCrudRepository;
import curso.modulo6.sprintm6.persistence.entity.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * curso.awake.modulo6.grupal5.persistence.repository
 *
 * @author Sergio Teran on 31-07-2022
 */

@Repository
public class CapacitacionRepository {

    private final ICapacitacionCrudRepository capRepository;

    public CapacitacionRepository(ICapacitacionCrudRepository capRepository) {
        this.capRepository = capRepository;
    }

    public List<Capacitacion> getAll(){
        return (List<Capacitacion>) capRepository.findAll();
    }

    public Optional<Capacitacion> getOne(int capId){
        return capRepository.findById(capId);
    }

    public Capacitacion save(Capacitacion cap){
        return capRepository.save(cap);
    }

    public void delete(int capId){
        capRepository.deleteById(capId);
    }
}
