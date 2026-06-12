// Q. Write a Java program to input a number and print its square and cube.


import java.util.Scanner;

public class Squre_qube {
    public static void main(String arg[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Given number : ");
        a= sc.nextInt();
    
        System.out.println("Squre of number is : "+(a*a));
        System.out.println("Qube of Number is : "+(a*a*a));

    }
    
}
