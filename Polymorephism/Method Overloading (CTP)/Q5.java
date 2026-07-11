// 5.Write a Java program to overload a method display() with different parameter lists.

class DisplayExample {

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(String name, int rollNo, String course) {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Course: " + course);
    }
}

public class Q5 {
    public static void main(String[] args) {
        DisplayExample d = new DisplayExample();

        d.display("Anish Gupta");
        d.display("Simran", 21);
        d.display("Neha", 5, "BCA");
    }
}
