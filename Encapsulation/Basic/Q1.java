
import java.util.Scanner;

// 1.·  Create a Student class with private name and rollNo. Use getters and setters. 

class Student {
    private String name;
    private int rollNo;

    void setName(String name){
        this.name = name;
    }
    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    String getName(){
        return  name;
    }

    int getRollNo(){
        return  rollNo;
    }
        
}

class Q1{
    public static void main(String[] args) {
        Student s = new Student();
        String name;
        int roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        name= sc.nextLine();
        s.setName(name);
        System.out.print("Enter student Roll number  : ");
        roll= sc.nextInt();
        s.setRollNo(roll);

        System.out.println("======Student Details=====");
        System.out.println("Name is : "+s.getName());
        System.out.println("RollNo is : "+s.getRollNo());
    }
}