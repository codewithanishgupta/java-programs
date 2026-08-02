package services;

import appointments.Appointment;
import java.util.HashMap;

public class HospitalService {
    private HashMap<String , Appointment> appointments = new HashMap<>();

    public void bookAppointment (Appointment appointment){
        appointments.put(appointment.getAppointmentId(), appointment);

        System.out.println("Appoinment Booked! : "+appointment.getAppointmentId());
        System.out.println("Patient : "+appointment.getPatient().getPatientName());
        System.out.println("Doctor  : "+appointment.getDoctor().getDoctorName());
    }

    public Appointment getaAppointment (String appointmentId){
        return appointments.get(appointmentId);
    }
}
