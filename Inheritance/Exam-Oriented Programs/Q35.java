// 35.Write a Java program showing real-life use of inheritance in a hospital management system.

class HospitalMember {
    String name;
    int age;

    public HospitalMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends HospitalMember {
    String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Patient extends HospitalMember {
    String disease;

    public Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Disease: " + disease);
    }
}

class Nurse extends HospitalMember {
    String ward;

    public Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Ward Assigned: " + ward);
    }
}

public class Q35 {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sanjana", 22, "Cardiology");
        d.showDetails();

        System.out.println("-------------------");

        Patient p = new Patient("Anish", 21, "Fever");
        p.showDetails();

        System.out.println("-------------------");

        Nurse n = new Nurse("Joya", 30, "ICU");
        n.showDetails();
    }
}