// 10.Create a program to overload a method display() for student details.

class Student {
    String name;
    int rollNo;
    String course;

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int rollNo) {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    void display(String name, int rollNo, String course) {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Course: " + course);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Student s = new Student();

        s.display("Anish Gupta");
        s.display("simmu", 8);
        s.display("Neha", 32, "BCA");
    }
}
