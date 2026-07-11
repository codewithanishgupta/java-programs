// 4.Write a Java program to overload the constructor of a class Student.

class Student {
    String name;
    int rollNo;
    String course;

    Student() {
        name = "Unknown";
        rollNo = 0;
        course = "Not Assigned";
    }

    Student(String n) {
        name = n;
        rollNo = 0;
        course = "Not Assigned";
    }

    Student(String n, int r) {
        name = n;
        rollNo = r;
        course = "Not Assigned";
    }

    Student(String n, int r, String c) {
        name = n;
        rollNo = r;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Course: " + course);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anish Gupta");
        Student s3 = new Student("Lado", 4);
        Student s4 = new Student("Neha", 5, "BCA");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
