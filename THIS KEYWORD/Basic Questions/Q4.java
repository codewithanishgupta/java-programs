// 4.Write a Java program to print current object using this keyword.

class Student{
    int roll;
    String name;

    public Student(int roll , String name) {
        this.roll=roll;
        this.name=name;
    }

    public String toString() {
        return "Roll = " + roll + ", Name = " + name;
    }

    void show(){
        System.out.println(this);
    }
    
}


public class Q4 {
    public static void main(String[] args) {
        Student S1= new Student(29, "Anish gupta");
        Student S2= new Student(9, "Simmu Jha");
        S1.show();
        S2.show();
    }
    
}
