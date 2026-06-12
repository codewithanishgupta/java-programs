// 20.Write a Java program to calculate the average of n numbers entered by the user.


import java.util.Scanner;

public class twenty {
      public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n,num,sum=0,ave=0;
        System.out.println("Enter the how many numbers :");
        n=sc.nextInt();
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++){
            num=sc.nextInt();
            sum=sum+num;
        }
        ave=sum/n;
        System.out.println("Average of n numbers is : "+ave);
    }
}
