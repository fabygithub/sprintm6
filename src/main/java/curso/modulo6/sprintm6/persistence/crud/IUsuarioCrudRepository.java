package curso.modulo6.sprintm6.persistence.crud;

import curso.modulo6.sprintm6.persistence.entity.Profesional;
import curso.modulo6.sprintm6.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * curso.awake.modulo6.grupal51.persistence.crud
 *
 * @author Sergio Teran on 02-08-2022
 */

public interface IUsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    @Query("select max(usuarioId) from Usuario")
    public Integer maxId();
}
