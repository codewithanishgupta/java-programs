// Q22.Write a Java program to input 5 numbers and calculate the average.

import java.util.Scanner;
public class twenty_two {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int num,sum=0;
        double avg=0;
        System.out.print("Enter given  Five number : ");
        for(int i=0;i<5;i++){
            num=sc.nextInt();
            sum=sum+num;
        }
        avg=sum/5.0;
        System.out.println("Average of number is : "+avg);
    }
    
}
