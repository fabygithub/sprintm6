package curso.modulo6.sprintm6.modelo.domain.dto;

import javax.persistence.Column;

public class UsuarioRegistroDTO {
    private Integer usuarioId;
    private String usuarioNombre;
    private String usuarioFechaNac;
    private Integer usuarioTipo;

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

    public UsuarioRegistroDTO(Integer usuarioId, String usuarioNombre, String usuarioFechaNac, Integer usuarioTipo) {
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.usuarioFechaNac = usuarioFechaNac;
        this.usuarioTipo = usuarioTipo;
    }

    public UsuarioRegistroDTO() {
    }

    public UsuarioRegistroDTO(String usuarioNombre, String usuarioFechaNac, Integer usuarioTipo) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioFechaNac = usuarioFechaNac;
        this.usuarioTipo = usuarioTipo;
    }
}
