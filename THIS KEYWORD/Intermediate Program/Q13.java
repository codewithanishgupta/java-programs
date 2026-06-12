// 13.Write a Java program to pass object to another constructor using this.

class Student {
    int roll;
    String name;

    public Student(int roll , String name) {
        this.roll = roll;
        this.name=name;
    }

    public Student(Student S) {
        this.roll = S.roll;
        this.name = S.name;
        System.out.println("Copied Student Object:");
        System.out.println("Roll : " + this.roll);
        System.out.println("Name : " + this.name);
    }
    
}

public class Q13 {
    public static void main(String[] args) {
        Student S = new Student(29,"Anish gupta");
        Student S2= new Student(S);
    }
    
}
