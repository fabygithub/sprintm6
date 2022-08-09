package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.persistence.crud.IClienteCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * curso.modulo6.sprintm6.persistence.repository
 *
 * @author Sergio Teran on 09-08-2022
 */

@Repository
public class ClienteRepository {

    private final IClienteCrudRepository crudRepository;

    public ClienteRepository(IClienteCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }
}
