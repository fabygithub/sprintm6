package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.*;

/**
 * awake.modulo6.grupal2.persistence.entity
 *
 * @author Sergio Teran on 26-07-2022
 */

@Entity
@Table(name = "capacitacion")
public class Capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rut;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    @Column(name = "c_asistentes")
    private Integer cAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(Integer id, Integer rut, String dia, String hora, String lugar, String duracion, Integer cAsistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cAsistentes = cAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rut=" + rut +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cAsistentes=" + cAsistentes +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getcAsistentes() {
        return cAsistentes;
    }

    public void setcAsistentes(Integer cAsistentes) {
        this.cAsistentes = cAsistentes;
    }
}
