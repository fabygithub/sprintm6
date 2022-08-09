package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.persistence.crud.IAdministrativoCrudRepository;
import org.springframework.stereotype.Repository;

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
}
