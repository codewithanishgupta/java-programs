// Q3.Write a Java program to find the largest of two numbers.


import java.util.Scanner;
public class three {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);

        int num1,num2;
        System.out.println("Enter the given two number : ");
        num1=sc.nextInt();
        num2=sc.nextInt();

        if(num1>num2)
            System.out.println("Maximum number is : "+num1);
        else
            System.out.println("Maximum of two number is : "+num2);
        
    }
}