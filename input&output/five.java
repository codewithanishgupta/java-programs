// Q5. Write a Java program to input the radius of a circle and calculate the area.

import java.util.Scanner;

public class five {
    public static void main(String arg[]){
        int r;
        ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("Area of a circle is : "+area);
    }
}
