package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * curso.modulo6.sprintm6.persistence.entity
 *
 * @author Sergio Teran on 08-08-2022
 */

@Entity
@Table(name = "entidad")
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entidad")
    private Integer idEntidad;

    @Column(name = "rut_cliente")
    private Integer rutCliente;
    @Column(name = "nombres_cliente")
    private String nombresCliente;
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;
    private String telefono;
    @Column(name = "afp_ckiente")
    private String afpCliente;
    @Column(name = "sistema_salud_cliente")
    private Integer sistemaSaludCliente;
    @Column(name = "direccion_cliente")
    private String direccionCliente;
    @Column(name = "comuna_cliente")
    private String comunaCliente;
    @Column(name = "edad_cliente")
    private Integer edadCliente;
    @Column(name = "titulo_profesional")
    private String tituloProfesional;
    @Column(name = "fecha_ingreso_profesional")
    private String fechaIngresoProfesional;
    @Column(name = "area_administrativo")
    private String areaAdministrativo;
    @Column(name = "experiencia_administrativo")
    private String experienciaAdministrativo;
    @Column(name = "id_usuario")
    private Integer idUsuario;

    public Entidad() {
    }

    public Entidad(Integer idEntidad, Integer rutCliente, String nombresCliente, String apellidosCliente, String telefono, String afpCliente, Integer sistemaSaludCliente, String direccionCliente, String comunaCliente, Integer edadCliente, String tituloProfesional, String fechaIngresoProfesional, String areaAdministrativo, String experienciaAdministrativo, Integer idUsuario) {
        this.idEntidad = idEntidad;
        this.rutCliente = rutCliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.telefono = telefono;
        this.afpCliente = afpCliente;
        this.sistemaSaludCliente = sistemaSaludCliente;
        this.direccionCliente = direccionCliente;
        this.comunaCliente = comunaCliente;
        this.edadCliente = edadCliente;
        this.tituloProfesional = tituloProfesional;
        this.fechaIngresoProfesional = fechaIngresoProfesional;
        this.areaAdministrativo = areaAdministrativo;
        this.experienciaAdministrativo = experienciaAdministrativo;
        this.idUsuario = idUsuario;
    }

    public Integer getId() {
        return idEntidad;
    }

    public void setId(Integer id) {
        this.idEntidad = id;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfpCliente() {
        return afpCliente;
    }

    public void setAfpCliente(String afpCliente) {
        this.afpCliente = afpCliente;
    }

    public Integer getSistemaSaludCliente() {
        return sistemaSaludCliente;
    }

    public void setSistemaSaludCliente(Integer sistemaSaludCliente) {
        this.sistemaSaludCliente = sistemaSaludCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getComunaCliente() {
        return comunaCliente;
    }

    public void setComunaCliente(String comunaCliente) {
        this.comunaCliente = comunaCliente;
    }

    public Integer getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(Integer edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getFechaIngresoProfesional() {
        return fechaIngresoProfesional;
    }

    public void setFechaIngresoProfesional(String fechaIngresoProfesional) {
        this.fechaIngresoProfesional = fechaIngresoProfesional;
    }

    public String getAreaAdministrativo() {
        return areaAdministrativo;
    }

    public void setAreaAdministrativo(String areaAdministrativo) {
        this.areaAdministrativo = areaAdministrativo;
    }

    public String getExperienciaAdministrativo() {
        return experienciaAdministrativo;
    }

    public void setExperienciaAdministrativo(String experienciaAdministrativo) {
        this.experienciaAdministrativo = experienciaAdministrativo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
