package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.persistence.crud.IAdministrativoCrudRepository;
import curso.modulo6.sprintm6.persistence.entity.Administrativo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * curso.modulo6.sprintm6.persistence.repository
 *
 * @author Sergio Teran on 09-08-2022
 */

@Repository
public class AdministrativoRepository {

    private final IAdministrativoCrudRepository crudRepository;

    public AdministrativoRepository(IAdministrativoCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Administrativo> getAll(){
        return (List<Administrativo>) crudRepository.findAll();
    }
    public Optional<Administrativo> getOne(int adminId){
        return crudRepository.findById(adminId);
    }
    public void delete(int adminId){
        crudRepository.deleteById(adminId);
    }
    public Administrativo save(Administrativo administrativo){
        return crudRepository.save(administrativo);
    }
    public Administrativo getOneByIdUsuario(int usuarioId){
        return crudRepository.findOneByIdUsuario(usuarioId);
    }
}
