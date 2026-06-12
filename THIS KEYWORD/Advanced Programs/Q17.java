// 17.Write a Java program to show difference between this and object reference.

class Student {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println("Roll : "+roll);
        System.out.println("Name : "+name);
    }

    void compare(Student s){
        if(this==s){
            System.out.println("Both refer to the same object..");
        }else{
            System.out.println("Different   Object ");
        }
    }
    
}


public class Q17 {
    public static void main(String[] args) {
    Student s1=new Student(29, "Anish gupta");
    Student s2= new Student(9, "Simmu jha");
    s1.display();
    s2.display();
    s1.compare(s1);
    s1.compare(s2);
    }
}
