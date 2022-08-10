package curso.modulo6.sprintm6.modelo.domain.service;

import curso.modulo6.sprintm6.persistence.entity.Profesional;
import curso.modulo6.sprintm6.persistence.repository.ProfesionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * curso.modulo6.sprintm6.domain.service
 *
 * @author Sergio Teran on 08-08-2022
 */
@Service
public class ProfesionalService {

    private final ProfesionalRepository repository;

    public ProfesionalService(ProfesionalRepository repository) {
        this.repository = repository;
    }
    public List<Profesional> getAll(){
        return repository.getAll();
    }
    public Optional<Profesional> getOne(int profesionalId){
        return repository.getOne(profesionalId);
    }
    public Profesional save(Profesional profesional){
        return repository.save(profesional);
    }
    public boolean delete(int profesionalId){
        return getOne(profesionalId).map(profesional -> {
            repository.delete(profesionalId);
            return true;
        }).orElse(false);
    }
}
