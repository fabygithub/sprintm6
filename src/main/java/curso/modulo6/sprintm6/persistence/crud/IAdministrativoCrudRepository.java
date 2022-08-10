package curso.modulo6.sprintm6.persistence.crud;

import curso.modulo6.sprintm6.persistence.entity.Administrativo;
import org.springframework.data.repository.CrudRepository;

/**
 * curso.modulo6.sprintm6.persistence.crud
 *
 * @author Sergio Teran on 09-08-2022
 */
public interface IAdministrativoCrudRepository extends CrudRepository<Administrativo, Integer>{

    public Administrativo findOneByIdUsuario(int usuarioId);
}
