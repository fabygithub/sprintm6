package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * curso.modulo6.sprintm6.persistence.entity
 *
 * @author Sergio Teran on 09-08-2022
 */

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @Column(name = "rut_cliente")
    private Integer rut;
    @Column(name = "nombres_cliente")
    private String nombres;
    @Column(name = "apellidos_cliente")
    private String apellidos;
    @Column(name = "telefono_cliente")
    private String telefono;
    @Column(name = "afp_cliente")
    private String afp;
    @Column(name = "sistema_salud_cliente")
    private String sistemaSalud;
    @Column(name = "direccion_cliente")
    private String direccion;
    @Column(name = "comuna_cliente")
    private String comuna;
    @Column(name = "edad_cliente")
    private Integer edad;
    @Column(name = "usuario_id_usuario")
    private Integer idUsuario;
//    @ManyToOne
//    @JoinColumn(name = "usuario_id_usuario", insertable = false, nullable = false)
//    private Usuario usuario;

    public Cliente() {
    }

    public Cliente(Integer idCliente, Integer rut, String nombres, String apellidos, String telefono, String afp, String sistemaSalud, String direccion, String comuna, Integer edad, Integer idUsuario/*Usuario usuario*/) {
        this.idCliente = idCliente;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
        this.idUsuario = idUsuario;
        //this.usuario = usuario;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud='" + sistemaSalud + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                ", idUsuario=" + idUsuario +
                '}';
    }
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
}
