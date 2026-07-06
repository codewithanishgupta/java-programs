// 2. Create a class Person with data members name and age. Derive a class Student with an additional field rollNo.

import java.util.Scanner;

class Person {
    int age;
    String name;
}

class Student extends Person {
    Scanner sc = new Scanner(System.in);
    int rollNo;

    void input() {
        System.out.println("Enter Student name : ");
        name = sc.nextLine();
        System.out.println("Enter student age : ");
        age = sc.nextInt();
        System.out.println("Enter Student rollNumber : ");
        rollNo = sc.nextInt();
    }

    void Display() {
        System.out.println("----------------Student details -------------");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Age : " + age);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.Display();
    }
}
