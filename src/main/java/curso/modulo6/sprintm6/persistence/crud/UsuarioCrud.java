package curso.modulo6.sprintm6.persistence.crud;

import curso.modulo6.sprintm6.persistence.entity.UsuarioEntidad;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrud extends CrudRepository<UsuarioEntidad, String> {
    boolean existsByUsername(String username);
}
