// 22.Write a Java program to create class Vehicle and Car and use super 
//    to call parent constructor.

import java.util.Scanner;

class Vehicle{

    String brand;
    int price;
    String modal;
    int speed;

    public Vehicle(String brand , String modal, int price, int speed) {
        this.brand=brand;
        this.modal=modal;
        this.price=price;
        this.speed=speed;
    }
    
}

class Car extends Vehicle{
    int door;

    public Car(String brand, String modal,int price , int speed ,int door) {
        super(brand, modal, price, speed);
        this.door=door;
    }
    
    void display(){
        System.out.println("----------Car Details---------");
        System.out.println("Brand      : "+ brand);
        System.out.println("Modal      : "+ modal);
        System.out.println("Speed      : "+ speed+" Km/h");
        System.out.println("Door       : "+ door);
        System.out.println("Pricce Rs. : "+ price);
    }
}



public class VehicleCar {
    public static void main(String[] args) {
        String brand,modal;
        int speed,price,door;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Car Brand Name : ");
        brand=sc.nextLine();
        System.out.print("Enter Car Modal Name : ");
        modal=sc.nextLine();
        System.out.print("Enter Car Speed      : ");
        speed=sc.nextInt();
        System.out.print("Enter Car Door       : ");
        door=sc.nextInt();
        System.out.print("Enter Car Price      : ");
        price=sc.nextInt();

        Car C=new Car(brand, modal, price, speed, door);
        C.display();
        sc.close();
        
    }
}
