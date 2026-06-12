// 29.Write a Java program to create immutable class using constructor and this.


final class Student {          
    private final int roll;    
    private final String name;

    
    public Student(int roll, String name) {
        this.roll = roll;     
        this.name = name;
    }

    public int getRoll() { // sirf data get kar skta hai set nahi kar skta
        return roll;
    }

    public String getName() {
        return name;
    }
}

public class Q29 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anish Gupta");

        System.out.println("Roll: " + s1.getRoll());
        System.out.println("Name: " + s1.getName());

        // s1.roll = 202;   cannot assign value to final variable
        // s1.name = "Raju";   no setter, field is final
    }
}

