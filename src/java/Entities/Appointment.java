package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Janam
 */
@Entity
@XmlRootElement
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAppointment;

    @NotNull
    private Boolean appointmentChange;

    @Temporal(TemporalType.DATE)
    private Date appointmentDate;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Psychologist psychologist;

    /**
     * Empty constructor
     */
    public Appointment() {
        super();
    }

    /**
     * Constructor with parameters
     *
     * @param idAppointmet
     * @param appointmentDate
     * @param appointmentChange
     * @param patient
     * @param psychologist
     */
    public Appointment(Long idAppointmet, Date appointmentDate, Boolean appointmentChange, Patient patient, Psychologist psychologist) {
        this.idAppointment = idAppointment;
        this.appointmentDate = appointmentDate;
        this.appointmentChange = appointmentChange;
        this.patient = patient;
        this.psychologist = psychologist;
    }

    public Long getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Long idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Boolean getAppointmentChange() {
        return appointmentChange;
    }

    public void setAppointmentChange(Boolean appointmentChange) {
        this.appointmentChange = appointmentChange;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Psychologist getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(Psychologist psychologist) {
        this.psychologist = psychologist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAppointment != null ? idAppointment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.idAppointment == null && other.idAppointment != null) || (this.idAppointment != null && !this.idAppointment.equals(other.idAppointment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Appointment{" + "idAppointment=" + idAppointment + ", appointmentChange=" + appointmentChange + ", appointmentDate=" + appointmentDate + ", patient=" + patient + ", psychologist=" + psychologist + '}';
    }
}
