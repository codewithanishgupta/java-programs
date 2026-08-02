package appointments;

import doctors.Doctor;
import patients.Patient;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String appointmentId , Patient patient , Doctor doctor) {
        this.appointmentId = appointmentId ;
        this.patient = patient ;
        this.doctor = doctor;
    }
    public String getAppointmentId() { return appointmentId; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
}

