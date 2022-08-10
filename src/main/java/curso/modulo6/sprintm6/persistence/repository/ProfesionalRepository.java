package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.persistence.crud.IProfesionalCrudRepository;
import curso.modulo6.sprintm6.persistence.entity.Profesional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * curso.modulo6.sprintm6.persistence.repository
 *
 * @author Sergio Teran on 08-08-2022
 */

@Repository
public class ProfesionalRepository {

    private final IProfesionalCrudRepository crudRepository;

    public ProfesionalRepository(IProfesionalCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Profesional> getAll(){
        return (List<Profesional>) crudRepository.findAll();
    }
    public Optional<Profesional> getOne(int profesionalId){
        return crudRepository.findById(profesionalId);
    }
    public Profesional save(Profesional profesional){
        return crudRepository.save(profesional);
    }
    public void delete(int profesionalId){
        crudRepository.deleteById(profesionalId);
    }
    /*public Profesional findAllByUsuario(){
        return crudRepository.findAllByUsuario();
    }*/
    public Profesional getOneByUsuario(int usuarioId){
        return crudRepository.findOneByIdUsuario(usuarioId);
    }
}
