// Q4.Write a Java program to find the largest of three numbers.

import java.util.Scanner;
public class four {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the given threee number : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b && a>c)
            System.out.println("Maximum number is : "+a);
        else if(b>a && b>c)
            System.out.println("Maximum number is : "+b);
        else
            System.out.println("Maximum number is : "+c);
        
    }
}