// 18.Write a Java program to use this keyword with instance methods and variables together.

class Student {
    int roll;
    String name;
    Student(int roll, String name) {
        this.roll = roll;      
        this.name = name;
    }

    
    void display() {
        System.out.println("Roll : " + this.roll);
        System.out.println("Name : " + this.name);
    }

    void showDetails() {
        System.out.println("Calling display() using this...");
        this.display();
    }
}


public class Q18 {
    public static void main(String[] args) {
        Student s = new Student(29, "Anish Gupta");
        s.showDetails();
    }
}
