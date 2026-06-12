// Q14.Write a Java program to input a number and count the digits.


import java.util.Scanner;
public class fourteen {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num,count=0;
        System.out.print("Enter the given number : ");
        num=sc.nextInt();
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("Number of digit is : "+count);
    }
}
