package curso.modulo6.sprintm6.modelo.domain.service;

import curso.modulo6.sprintm6.persistence.entity.Capacitacion;
import curso.modulo6.sprintm6.persistence.repository.CapacitacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * curso.awake.modulo6.grupal5.domain.service
 *
 * @author Sergio Teran on 31-07-2022
 */

@Service
public class CapacitacionService {

    private final CapacitacionRepository repository;

    public CapacitacionService(CapacitacionRepository repository) {
        this.repository = repository;
    }

    public List<Capacitacion> getAll(){
        return repository.getAll();
    }

    public Optional<Capacitacion> getOne(int capId){
        return repository.getOne(capId);
    }

    public Capacitacion save(Capacitacion cap){
        return repository.save(cap);
    }

    public boolean delete(int capId){
        return getOne(capId)
                .map(capacitacion -> {
                    repository.delete(capId);
                    return true;
                }).orElse(false);
    }
}
