// 34.Write a Java program to manage student records using inheritance.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student {
    String thesisTitle;

    public GraduateStudent(String name, int age, String studentId, String thesisTitle) {
        super(name, age, studentId);
        this.thesisTitle = thesisTitle;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

class UndergraduateStudent extends Student {
    String major;

    public UndergraduateStudent(String name, int age, String studentId, String major) {
        super(name, age, studentId);
        this.major = major;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Major: " + major);
    }
}

public class Q34 {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Anish", 21, "S101", "AI in Education");
        gs.showDetails();

        System.out.println("-------------------");

        UndergraduateStudent us = new UndergraduateStudent("Rahul", 19, "U202", "Computer Science");
        us.showDetails();
    }
}