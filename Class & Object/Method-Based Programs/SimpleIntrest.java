// 15. Write a Java program to calculate simple interest using class and methods.

import java.util.Scanner;

public class SimpleIntrest {
    double p,r,t,result;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the principle : ");
        p=sc.nextDouble();
        System.out.print("Enter rate : ");
        r=sc.nextDouble();
        System.out.print("Enter the time in year : ");
        t=sc.nextDouble();
    }
    void calculate(){
         result = (p*r*t)/100;
    }
    void result(){
        System.out.println("Simple intrest is : "+result);
    }
    public static void main(String[] args) {
        SimpleIntrest si=new SimpleIntrest();
        si.input();
        si.calculate();
        si.result();
    }
}
