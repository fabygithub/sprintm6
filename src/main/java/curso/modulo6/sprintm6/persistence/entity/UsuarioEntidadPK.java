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

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(Integer entidadId) {
        this.entidadId = entidadId;
    }

    public UsuarioEntidadPK(Integer usuarioId, Integer entidadId) {
        this.usuarioId = usuarioId;
        this.entidadId = entidadId;
    }
}
