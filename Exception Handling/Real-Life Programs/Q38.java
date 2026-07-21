
import java.util.ArrayList;

// 38.Student Registration System with custom exceptions.

class RegistrationException extends Exception {

    public RegistrationException(String message) {
        super(message);
    }

}

class Student {
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) throws RegistrationException {
        if (name == null || name.trim().isEmpty()) {
            throw new RegistrationException("Student name can not be Empty.");
        }
        if (age < 18) {
            throw new RegistrationException("Student at least 18 years old.");
        }
        if (course == null || course.trim().isEmpty()) {
            throw new RegistrationException("Course can not be empty.");
        }

        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return name + "-" + course;
    }

    void displayInfo() {
        System.out.println("Registered student -> Name : " + name + " | Age : " + age + " | course : " + course);
    }

}

class RegistrationSystem {
    ArrayList<String> registeredNames = new ArrayList<>();

    void registeredStudent(Student s) throws RegistrationException {
        if (registeredNames.contains(s.toString())) {
            throw new RegistrationException("Student already registered.");
        }
        registeredNames.add(s.toString());
        s.displayInfo();
    }
}

public class Q38 {
    public static void main(String[] args) {
        System.out.println("--------- Student Registration System ---------");

        RegistrationSystem system = new RegistrationSystem();

        try {
            Student s1 = new Student("Anish Gupta", 21, "BCA");
            system.registeredStudent(s1);

            Student s2 = new Student("", 21, "B-tech");
            system.registeredStudent(s2);
        } catch (RegistrationException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            Student s3 = new Student("Amrit", 17, "MCA");
            system.registeredStudent(s3);
        } catch (RegistrationException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            Student s4 = new Student("Simran", 22, "");
            system.registeredStudent(s4);
        } catch (RegistrationException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }

        try {
            Student s5 = new Student("Anish Gupta", 21, "BCA");
            system.registeredStudent(s5);
        } catch (RegistrationException e) {
            System.out.println("Exception Handled : " + e.getMessage());
        }
    }
}
