// Q12.Write a Java program to find the smallest of three numbers.


import java.util.Scanner;
public class Twelve {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter the First Number : ");
        num1=sc.nextInt();
        System.out.print("Enter the Second Number : ");
        num2=sc.nextInt();
        System.out.print("Enter the Third Number : ");
        num3=sc.nextInt();

        if(num1<num2)
            if(num1<num3)
                System.out.println("Smalest Number is : "+num1);
            else
                System.out.println("Smalest Number is : "+num3);
        else
             if(num2<num3)
                System.out.println("Smalest Number is : "+num2);
            else
                System.out.println("Smalest Number is : "+num3);
    }
    
}
