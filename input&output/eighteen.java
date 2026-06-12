// Q18.Write a Java program to input the sides of a triangle and check whether the triangle is valid.

import java.util.Scanner;
public class eighteen {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three side of triangle : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Traingle is valid");
        }else{
            System.out.println("Traingle not valid");
        }
    }
    
}
