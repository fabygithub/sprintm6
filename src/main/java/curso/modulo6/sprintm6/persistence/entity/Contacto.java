package curso.modulo6.sprintm6.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * curso.awake.modulo6.grupal51.persistence.entity
 *
 * @author Sergio Teran on 02-08-2022
 */

@Entity
public class Contacto {

    @Id
    private Integer contactoId;
    private String contactoName;
    private String contactoEmail;
    private String contactoPhono;
    private String contactoMessage;

    public Integer getContactoId() {
        return contactoId;
    }

    public void setContactoId(Integer contactoId) {
        this.contactoId = contactoId;
    }

    public String getContactoName() {
        return contactoName;
    }

    public void setContactoName(String contactoName) {
        this.contactoName = contactoName;
    }

    public String getContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(String contactoEmail) {
        this.contactoEmail = contactoEmail;
    }

    public String getContactoPhono() {
        return contactoPhono;
    }

    public void setContactoPhono(String contactoPhono) {
        this.contactoPhono = contactoPhono;
    }

    public String getContactoMessage() {
        return contactoMessage;
    }

    public void setContactoMessage(String contactoMessage) {
        this.contactoMessage = contactoMessage;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "contactoId=" + contactoId +
                ", contactoName='" + contactoName + '\'' +
                ", contactoEmail='" + contactoEmail + '\'' +
                ", contactoPhono='" + contactoPhono + '\'' +
                ", contactoMessage='" + contactoMessage + '\'' +
                '}';
    }
}
