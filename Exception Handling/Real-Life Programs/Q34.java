// 34.Hospital Management System using custom exceptions.


class HospitalException extends Exception {
    public HospitalException(String message) {
        super(message);
    }
}

class Hospital {
    private int totalBeds;
    private int occupiedBeds;

    public Hospital(int totalBeds) {
        this.totalBeds = totalBeds;
        this.occupiedBeds = 0;
    }

    public void admitPatient(int patients) throws HospitalException {
        if (patients <= 0) {
            throw new HospitalException("Invalid number of patients to admit.");
        } else if (occupiedBeds + patients > totalBeds) {
            throw new HospitalException("Not enough beds available. Current free beds: " + (totalBeds - occupiedBeds));
        } else {
            occupiedBeds += patients;
            System.out.println("Admission successful! Patients admitted: " + patients + " | Occupied beds: " + occupiedBeds);
        }
    }

    public void dischargePatient(int patients) throws HospitalException {
        if (patients <= 0) {
            throw new HospitalException("Invalid number of patients to discharge.");
        } else if (patients > occupiedBeds) {
            throw new HospitalException("Cannot discharge more patients than admitted. Current occupied beds: " + occupiedBeds);
        } else {
            occupiedBeds -= patients;
            System.out.println("Discharge successful! Patients discharged: " + patients + " | Occupied beds: " + occupiedBeds);
        }
    }

    public void displayStatus() {
        System.out.println("Total beds: " + totalBeds + " | Occupied beds: " + occupiedBeds + " | Free beds: " + (totalBeds - occupiedBeds));
    }
}

public class Q34 {
    public static void main(String[] args) {
        System.out.println("--------- Hospital Management System ----------");

        Hospital hospital = new Hospital(10);

        hospital.displayStatus();

        try {
            hospital.admitPatient(5);
            hospital.admitPatient(7);
        } catch (HospitalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            hospital.dischargePatient(0);
        } catch (HospitalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        try {
            hospital.dischargePatient(3);
        } catch (HospitalException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        hospital.displayStatus();
    }
}