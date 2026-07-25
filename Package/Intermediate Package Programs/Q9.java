// 9.Create a package hospital with classes: Doctor , Patient -> display patient and doctor details.

import hospital.Doctor;
import hospital.Patient;

public class Q9 {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sharma", 45, "Cardiologist");
        Patient p = new Patient("Anish", 29, "Fever");

        d.showDoctor();
        p.showPatient();
    }
}

