// Q10.Write a Java program to check whether a number is a 3-digit number or not.


import java.util.Scanner;
public class ten {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int num,c=0;
        System.out.println("Enter the given number : ");
        num=sc.nextInt();
        while(num>0){
            c++;
            num=num/10;
        }
        if(c==3)
            System.out.println("Given Number is 3 Digit number...........");
        else
            System.out.println("Given number is not 3 digit number......");
    }
    
}
