package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * curso.modulo6.sprintm6.persistence.entity
 *
 * @author Sergio Teran on 08-08-2022
 */

@Entity
@Table(name = "profesional")
public class Profesional {

    @Id
    @Column(name = "id_profesional")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo_profesional")
    private String titulo;
    @Column(name = "fecha_ingreso_profesional")
    private String fecha;
    @Column(name = "usuario_id_usuario")
    private Integer idUsuario;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    public Profesional() {
    }

    public Profesional(Integer id, String titulo, String fecha, Integer idUsuario, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
