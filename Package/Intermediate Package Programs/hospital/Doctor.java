package hospital;

public class Doctor {
    private String name;
    private int age;
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public void showDoctor() {
        System.out.println("===== Doctor Details =====");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Specialization : " + specialization);
    }
}
