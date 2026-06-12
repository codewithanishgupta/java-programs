
import java.util.Scanner;

// 23. Create a Student Result System with percentage calculation. 

class Student {
    private String name;
    private int roll;
    private int [] marks = new int[5];
    private double sum,per;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.print("Enter Student name : ");
        name = sc.nextLine();
        System.out.print("Enter Student Roll : ");
        roll = sc.nextInt();
        for(int i=0 ;i<5 ; i++){
            System.out.print("Enter "+(i+1)+". sub marks : ");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
    }

    void display(){
        per=(sum*100)/500;
        System.out.println("======Student details========");
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+roll);
        for(int i=0 ; i<5 ;i++){
            System.out.println("Marks of  "+(i+1)+". Sub : "+marks[i]);
        }
        System.out.println("Total marks : "+sum);
        System.out.println("Percentage is : "+per);
    }
}

public class Q23 {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}
