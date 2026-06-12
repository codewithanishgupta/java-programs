// 14. Write a Java program to demonstrate method overloading in a class.

import java.util.Scanner;

class Overload{
    int x,y;
    void sum (){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        x=sc.nextInt();
        System.out.print("Enter the Secomd number  : ");
        y=sc.nextInt();
        System.out.println("Sum of Default functin  : "+(x+y));
    }
    void sum(int x,int y){
        this.x=x;
        this.y=y;
        int sum = x+y;
        System.out.println("Sum of parameterize Method : "+sum);
    }
    int sum(int x,int y ,int z){
        return (x+y+z);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.sum();
        obj.sum(30,55);
        int result=obj.sum(20,30,40);
        System.out.println("Sum of third parameterize Method : "+result);
    }
    
}
