// 11.Create a Student class where marks must be between 0 and 100. 

import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    void setName(String name){
        this.name= name;
    }
    void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("Invalid marks ! Marks must be between 0 and 100");
        }
    }

    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter student name : ");
        s.setName(sc.nextLine());
        System.out.print("Enter student marks : ");
        s.setMarks(sc.nextInt());

        System.out.println("======== Student Details =========");
        System.out.println("Name is : "+s.getName());
        System.out.println("Marks : "+s.getMarks());
    }
}
