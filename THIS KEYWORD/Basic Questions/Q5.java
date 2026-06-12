// 5.Write a Java program to pass current object as argument using this.

class Student{
    int roll;
    String name;

    public Student() {
    }
    
    public Student(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }

    static void display(Student S){
        System.out.println("Student Roll : "+S.roll );
        System.out.println("Student Name : "+S.name );
    }

    void show(){
        display(this);
    }
    
}


public class Q5 {
    public static void main(String[] args) {
        Student S1 = new Student(10, "Simran jii");
        Student S2= new Student(29, "Anish gupta");
        S1.show();
        S2.show();

    }
}
