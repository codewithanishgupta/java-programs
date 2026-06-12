// Q16.Write a Java program to input the marks of 5 subjects and calculate total and percentage.

import java.util.Scanner;
public class sixteen {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int sub[]=new int[5];
        int total=0,per=0;
        System.out.print("Enter the five subject marks : ");
        for(int i=0;i<5;i++){
            sub[i]=sc.nextInt();
            total=total+sub[i];
        }
        per=(total*100)/500;
        System.out.println("Total marks="+total);
        System.out.println("Percentage ="+per+"%    ");
    }
}
