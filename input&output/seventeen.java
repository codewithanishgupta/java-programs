// Q.Write a Java program to input temperature in Celsius and convert it to Fahrenheit

import java.util.Scanner;
class seventeen{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int celsius,fahrenheit=0;
        System.out.print("Enter the given censius : ");
        celsius=sc.nextInt();
        fahrenheit=(celsius*9/5)+32;
        System.out.println("Farrenheit is : "+fahrenheit);
    }
}