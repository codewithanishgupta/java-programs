// 1. Write a Java program to create a class Student with data members (id, name) and 
//      display them using object.

import java.util.Scanner;

public class StudentQ1 {
    Scanner sc= new Scanner(System.in);
    int id;
    String name= new String();
    void input(){
        System.out.print("Enter the Student id : ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Student name : ");
        name=sc.nextLine();
    }
    void display(){
        System.out.println("Student id is : "+id);
        System.out.println("Student name is : "+name);
    }
    public static void main(String[] args) {
        StudentQ1 ob=new StudentQ1();
        ob.input();
        ob.display();
    }
}
