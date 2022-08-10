package curso.modulo6.sprintm6.persistence.crud;

import curso.modulo6.sprintm6.persistence.entity.Profesional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * curso.modulo6.sprintm6.persistence.crud
 *
 * @author Sergio Teran on 08-08-2022
 */

public interface IProfesionalCrudRepository extends CrudRepository<Profesional, Integer> {

    /*@Query("select us.usuarioId, us.usuarioNombre, us.usuarioFechaNac, us.usuarioTipo,\n" +
            "    pr.id, pr.titulo, pr.fecha from Profesional as pr\n" +
            "    inner join Usuario as us on(pr.idUsuario = us.usuarioTipo)")
    public Profesional findAllByUsuario();*/

    public Profesional findOneByIdUsuario(int usuarioId);

}
