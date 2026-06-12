// 4. Write a Java program to initialize object using method (setData)
//  and display using another method.

import java.util.Scanner;

class ObjInitialize{
    int x=0;
    int y=0;

    void setdata(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Value of X : ");
        x=sc.nextInt();
         System.out.print("Enter the Value of Y : ");
        y=sc.nextInt();
    }
    void displayData(){
        System.out.println("X is : "+x);
        System.out.println("y is : "+y);
    }
}
public class Q4 {
    public static void main(String[] args) {
        ObjInitialize obj = new ObjInitialize();
        obj.setdata();
        obj.displayData();
    }
}
