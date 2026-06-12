/* Q14.Write a Java program to calculate grade based on marks
 Example:
●90–100 → A

●75–89 → B

●50–74 → C

Below 50 → Fail */

import java.util.Scanner;

public class fourteen {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int marks;
        char G;
        System.out.println("Enter the Given marks (0-100) : ");
        marks=sc.nextInt();
        if(marks>=90 && marks<=100)
            G='A';
        else if(marks>=75 && marks<=89)
            G='B';
        else if(marks>=50 && marks<=74)
            G='C';
        else
            G='F';

        System.out.print("Gread is : "+G);

    }
}
