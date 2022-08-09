package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * curso.modulo6.sprintm6.persistence.entity
 *
 * @author Sergio Teran on 08-08-2022
 */

@Entity
@Table(name = "usuario_entidad")
public class UsuarioEntidad {

    @EmbeddedId
    private UsuarioEntidadPK usuarioEntidadPK;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("idEntidad")
    @JoinColumn(name = "id_entidad", insertable = false, updatable = false)
    private Entidad entidad;


}
