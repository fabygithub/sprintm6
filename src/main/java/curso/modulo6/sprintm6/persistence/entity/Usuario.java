package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * curso.awake.modulo6.grupal51.persistence.entity
 *
 * @author Sergio Teran on 02-08-2022
 */

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuarioId;

    @Column(name = "nombre_usuario")
    private String usuarioNombre;

    @Column(name = "f_nacimiento_usuario")
    private String usuarioFechaNac;

    @Column(name = "tipo_usuario_id")
    private Integer usuarioTipo;


    public Usuario() {
    }

    public Usuario(Integer usuarioId, String usuarioNombre, String usuarioFechaNac, Integer usuarioTipo) {
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.usuarioFechaNac = usuarioFechaNac;
        this.usuarioTipo = usuarioTipo;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioFechaNac() {
        return usuarioFechaNac;
    }

    public void setUsuarioFechaNac(String usuarioFechaNac) {
        this.usuarioFechaNac = usuarioFechaNac;
    }

    public Integer getUsuarioTipo() {
        return usuarioTipo;
    }

    public void setUsuarioTipo(Integer usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }
}
