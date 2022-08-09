package curso.modulo6.sprintm6.persistence.crud;

import curso.modulo6.sprintm6.persistence.entity.Profesional;
import org.springframework.data.repository.CrudRepository;

/**
 * curso.modulo6.sprintm6.persistence.crud
 *
 * @author Sergio Teran on 08-08-2022
 */

public interface IProfesionalCrudRepository extends CrudRepository<Profesional, Integer> {
}
