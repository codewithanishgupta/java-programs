// 8.Write a Java program to demonstrate constructor chaining using this().

class Student{
    int roll;
    String name;


    Student (){
        roll=29;
        name="Anish gupta";
    }
    public Student(int roll, String name) {
        this();
        System.out.println("Without change ");
        System.out.println("Roll : "+this.roll+"       Name : "+this.name);

        System.out.println("With change ");
        System.out.println("Roll : "+roll+"       Name : "+name);
    }
    
}

public class Q8 {
    public static void main(String[] args) {
        Student S = new Student(2,"Raju");

    }
}
