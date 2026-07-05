// 30.Hospital Management System using interfaces.


import java.util.ArrayList;

interface  Hospital {
    void addPatient (String name);
    void dischargePatient (String name);
    void showPatients ();
}

class HospitalManagement implements Hospital {
    ArrayList<String> patients = new ArrayList<>();

    @Override
    public void addPatient (String name){
        patients.add(name);
        System.out.println(name+ " admitted to Hospital.");
    }
    @Override
    public void dischargePatient (String name){
        if(patients.contains(name)){
            patients.remove(name);
            System.out.println(name + " discharge from Hospital.");
        }else{
            System.out.println("Not Found in Hospital records.");
        }
    }
    @Override
    public void showPatients () {
        System.out.println("\n-------Patient In Hospital------------");
        for (String p : patients){
            System.out.println("-> "+p);
        }
        System.out.println();
    }
}

public class Q30 {
    public static void main(String[] args) {
        Hospital hos = new HospitalManagement();

        hos.addPatient("Ravi Kumar");
        hos.addPatient("Subham Sharma");
        hos.addPatient("Vikash Roy");

        hos.showPatients();

        hos.dischargePatient("Subham Sharma");
        hos.showPatients();
    }
}
