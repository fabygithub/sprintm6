package curso.modulo6.sprintm6.persistence.crud;

import curso.modulo6.sprintm6.persistence.entity.RolEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RolCrud extends CrudRepository<RolEntity, Integer> {
    Optional<RolEntity> findByRolName(String rolName);
}
