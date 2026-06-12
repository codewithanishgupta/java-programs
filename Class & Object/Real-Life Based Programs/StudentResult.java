// 26. Write a Java program to create class StudentResult to calculate total and percentage.

import java.util.Scanner;

public class StudentResult {
    private String name;
    private int roll,total,marks1,marks2,marks3,marks4,marks5;
    private float per;

    public StudentResult() {
    }
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter student name : ");
        name=sc.nextLine();
        System.out.print("Enter student Roll : ");
        roll=sc.nextInt();
        System.out.print("Enter student 1st sub marks : ");
        marks1=sc.nextInt();
        System.out.print("Enter student 2nd sub marks : ");
        marks2=sc.nextInt();
        System.out.print("Enter student 3rd sub marks : ");
        marks3=sc.nextInt();
        System.out.print("Enter student 4th sub marks : ");
        marks4=sc.nextInt();
        System.out.print("Enter student 5th sub marks : ");
        marks5=sc.nextInt();
    }
    void calculate(){
        total=marks1+marks2+marks3+marks4+marks5;
        per=(total/500.0f)*100;
    }
    void display(){
        System.out.println("Student name is : "+name);
        System.out.println("Student Rollnumbar : "+roll);
        System.out.println("total marks is : "+total);
        System.out.println("Student percentage is : "+per);
    }
        public static void main(String[] args) {
        StudentResult s=new StudentResult();
        s.input();
        s.calculate();
        s.display();
    }
}
