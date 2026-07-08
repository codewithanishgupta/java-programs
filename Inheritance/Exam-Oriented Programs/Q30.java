// 30.Write a Java program to demonstrate the use of the super keyword.

class Person {
    String name = "Default Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor executed...");
    }

    void display() {
        System.out.println("Person Name: " + name);
    }
}


class Student extends Person {
    String name = "Default Student";

    public Student(String name) {
        super(name); 
        System.out.println("Student constructor executed...");
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Student Name: " + this.name);
        System.out.println("Accessing Parent Name using super: " + super.name); 
    }
}


public class Q30 {
    public static void main(String[] args) {
        Student s = new Student("Anish");
        s.display();
    }
}
