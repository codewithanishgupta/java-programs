// 2. Write a Java program to create a class Car with properties 
//   (brand, model, price) and print details.

import java.util.Scanner;


class Car{
        
    Scanner sc= new Scanner(System.in);
    String brand;
    int model;
    int price;
    void input(){
         System.out.print("Enter the car Brand name : ");
        brand=sc.nextLine();
        System.out.print("Enter car model Number : ");
         model=sc.nextInt();
        System.out.print("Enter price of the car : ");
        price=sc.nextInt();
    }
    void show(){
       System.out.println("..........Details of car............");
        System.out.println("Brand Name of car is :"+brand);
        System.out.println("Model Number of car is : "+model);
        System.out.println("Price of the car is : "+price);
    }
}
public class CarWithProproperties {
    public static void main(String[] args) {
        Car c=new Car();
        c.input();
        c.show();
    }
}
