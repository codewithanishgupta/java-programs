// Q13.Write a Java program to input a number and find the sum of digits.


import java.util.Scanner;
public class thirteen {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int num,sum=0,digit=0;
        System.out.print("Enter the given number : ");
        num=sc.nextInt();
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of digit is : "+sum);
    }
    
}
