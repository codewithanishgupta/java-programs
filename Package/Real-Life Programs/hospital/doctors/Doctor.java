package doctors;

public class Doctor {
    private String doctorName;
    private String doctorId;
    private String specialization;

    public Doctor(String doctorName , String doctorId , String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName ;
        this.specialization = specialization ;
    }
    
    public String getDoctorId () {return doctorId;}
    public String getDoctorName () {return doctorName;}
    public String getSpecialization () {return specialization;}
}
