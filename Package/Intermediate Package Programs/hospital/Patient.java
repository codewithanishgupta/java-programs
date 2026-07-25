package hospital;

public class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void showPatient() {
        System.out.println("===== Patient Details =====");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
    }
}