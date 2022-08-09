package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * curso.modulo6.sprintm6.persistence.entity
 *
 * @author Sergio Teran on 08-08-2022
 */

@Embeddable
public class UsuarioEntidadPK implements Serializable {

    @Column(name = "usuario_id")
    private Integer usuarioId;
    @Column(name = "id_entidad")
    private Integer entidadId;
}
