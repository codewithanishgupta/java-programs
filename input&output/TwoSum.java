//  Write a Java program to input two numbers and print their sum.
//import java.net.SocketPermission;
import java.util.Scanner;

public class TwoSum {
        public static void main(String []args){
            int a;
            int b,sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the First number : ");
            a=sc.nextInt();
            System.out.print("Enter the Second Number : ");
            b=sc.nextInt();
            sum=a+b;
            System.out.println("Sum of two number Is : "+sum);

        }
}
