package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * curso.modulo6.sprintm6.persistence.entity
 *
 * @author Sergio Teran on 09-08-2022
 */

@Entity
@Table(name = "administrativo")
public class Administrativo {

    @Id
    @Column(name = "id_administrativo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin;
    @Column(name = "area_administrativo")
    private String area;
    @Column(name = "experiencia_administrativo")
    private String experiencia;
    @Column(name = "usuario_id_usuario")
    private Integer idUsuario;
    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario", insertable = false, nullable = false)
    private Usuario usuario;

    public Administrativo() {
    }

    public Administrativo(Integer idAdmin, String area, String experiencia, Integer idUsuario, Usuario usuario) {
        this.idAdmin = idAdmin;
        this.area = area;
        this.experiencia = experiencia;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
