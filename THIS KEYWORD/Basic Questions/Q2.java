// 2.Write a Java program to resolve ambiguity between local and instance variables using this.


class Student {
    int roll=29;
    String name="Anish gupta";

    public Student(int roll, String name) {
        System.out.println("Instance Variable is .");
        System.out.println("Roll : "+roll);
        System.out.println("Name : "+name);

        System.out.println("Local Variables is . ");
        System.out.println("Roll : "+this.roll);
        System.out.println("Name : "+this.name);
    }
    
}


public class Q2 {
    public static void main(String[] args) {
        Student S = new Student(10,"simmu");
    }
}
