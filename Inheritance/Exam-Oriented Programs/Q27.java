// 27.Write a Java program to demonstrate Multilevel Inheritance.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor executed...");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;

    public Student(String name, int age, String course) {
        super(name, age); // call Person constructor
        this.course = course;
        System.out.println("Student constructor executed...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Course: " + course);
    }
}

class EngineeringStudent extends Student {
    int year;

    public EngineeringStudent(String name, int age, String course, int year) {
        super(name, age, course);
        this.year = year;
        System.out.println("EngineeringStudent constructor executed...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Year: " + year);
    }
}

public class Q27 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent("Anish", 21, "Computer Science", 3);
        es.showDetails();
    }
}