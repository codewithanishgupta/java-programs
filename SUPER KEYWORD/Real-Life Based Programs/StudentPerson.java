// 21.Write a Java program to create class Person and Student and 
//      use super to access parent data.


class Person{
    int age=21;
    float height=5.6F;
    String name= " Anish gupta.";

}

class Student extends Person{
    int roll=29;

    void show(){
        System.out.println("=========Student Details=============");
        System.out.println("Name    : "+super.name);
        System.out.println("Roll    : "+roll);
        System.out.println("Age     : "+super.age);
        System.out.println("Height  : "+super.height);
    }
}


public class StudentPerson {
    public static void main(String[] args) {
        Student S= new Student();
        S.show();
    }
}
