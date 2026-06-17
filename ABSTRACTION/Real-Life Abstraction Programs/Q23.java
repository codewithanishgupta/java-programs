// 23.Write a Java program to create an abstract class Hospital with methods for patient treatment.

abstract class Hospital {
    String name;
    
    public Hospital(String name) {
        this.name = name;
    }
    
    abstract void patientTreatment(String patientName);

    void hospitalInfo() {
        System.out.println("Hospital Name : "+name);
    }
}

class Prabhatara extends Hospital {

    public Prabhatara(String name) {
        super(name);
    }
    @Override
    void patientTreatment(String patientName) {
        System.out.println("Prabhatara treating patient "+patientName);
    }
}

class Apollo extends Hospital {

    public Apollo(String name) {
        super(name);
    }
    @Override
    void patientTreatment(String paitentName) {
        System.out.println("Apollo treating patient "+paitentName);
    }
}
public class Q23 {
    public static void main(String[] args) {
        Hospital h1 = new Prabhatara("Prabhatara Muzaffarpur");
        h1.hospitalInfo();
        h1.patientTreatment("Rahul Yadav");

        Hospital h2 = new Apollo("Apollo Hospital");
        h2.hospitalInfo();
        h2.patientTreatment("Rupesh Sing");

    }
}
