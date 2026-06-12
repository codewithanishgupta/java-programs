// 5. Write a Java program to calculate area of a rectangle using class and object.

import java.util.Scanner;

class Rectangle{
    int l,b;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        l=sc.nextInt(); 
        System.out.print("Enter the breadth of rectangle : ");
        b=sc.nextInt();
    }
    void show(){
        int area=0;
        area=l*b;
        System.out.println("Area of a rectangle is : "+area);
    }
}
public class AreaOfRectangele {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.input();
        r.show();
    }
}
