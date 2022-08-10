package curso.modulo6.sprintm6.modelo.domain.dto;

import javax.persistence.Column;

public class RolDTO {

    private int rolId;
    private String rolName;

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public RolDTO(int rolId, String rolName) {
        this.rolId = rolId;
        this.rolName = rolName;
    }

    public RolDTO() {
    }

    public RolDTO(String rolName) {
        this.rolName = rolName;
    }
}
