// 28.Write a Java program to demonstrate Hierarchical Inheritance.

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
        super(name, age);
        this.course = course;
        System.out.println("Student constructor executed...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher constructor executed...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Subject: " + subject);
    }
}

public class Q28 {
    public static void main(String[] args) {
        Student s = new Student("Anish", 21, "Computer Science");
        s.showDetails();

        System.out.println("-------------------");

        Teacher t = new Teacher("Ganga", 35, "Mathematics");
        t.showDetails();
    }
}