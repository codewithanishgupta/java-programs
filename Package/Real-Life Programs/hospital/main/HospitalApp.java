package main;

import appointments.Appointment;
import doctors.Doctor;
import patients.Patient;
import services.HospitalService;

public class HospitalApp {
    public static void main(String[] args) {
        Patient p1 = new Patient("123", "Raju kumar", 29);

        Doctor d1 = new Doctor("Anish Gupta", "007", "Heart");

        Appointment a1 = new Appointment("A007", p1, d1);

        HospitalService service = new HospitalService();
        service.bookAppointment(a1);

        Appointment fetched = service.getaAppointment("A007");

        System.out.println("==========================================");
        System.out.println("Fetched Appointment : "+fetched.getAppointmentId());
        System.out.println("Patient : "+fetched.getPatient().getPatientName());
        System.out.println("Doctor : "+fetched.getDoctor().getDoctorName());
    }
}
