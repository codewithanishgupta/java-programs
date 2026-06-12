//Q5.Write a Java program to find the sum of numbers from 1 to n.

import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n number : ");
        n=sc.nextInt();
        int i=1,sum=0;

        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of N numbers : "+sum);
    }
}
