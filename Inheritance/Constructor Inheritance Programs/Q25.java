// 25.Create a student management program using inheritance and constructors.

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor exicuted...");
    }

    void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
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
        System.out.println("Course : " + course);
    }
}

class EngineeringStudent extends Student {
    int year;

    public EngineeringStudent(String name, int age, String course, int year) {
        super(name, age, course);
        this.year = year;
        System.out.println("EngineeringStudent constructor exicuted...");
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Year : " + year);
    }
}

public class Q25 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent("Anish Gupta", 21, "BCA", 2024);
        es.showDetails();
    }
}
