// Q.6 Write a Java program to input the length and breadth of a rectangle and find the area 
// and perimeter

import java.util.Scanner;

public class six {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of a recyangle : ");
        float a=sc.nextFloat();
        System.out.print("Enter the Breath of a recyangle : ");
        float b=sc.nextFloat();
        double area=a*b;
        System.out.print("Area of Rectangle is : "+area);
    }
    
}
