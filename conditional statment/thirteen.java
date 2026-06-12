// Q13.Write a Java program to check whether a person is eligible for voting (age ≥ 18).

import java.util.Scanner;
public class thirteen {
    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter the given age : ");
        age=sc.nextInt();
        if(age>18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not Eligible for voting");
        
    }
}