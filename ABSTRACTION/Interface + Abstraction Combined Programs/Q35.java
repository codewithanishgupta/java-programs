// 35.Write a Java program to create a vehicle management system using interfaces.

interface Vehicle {
    void start();
    void stop();
    double calculateFare (int distance );
}

class Car implements Vehicle {
    double ratePerKm = 20.0;

    @Override
    public void start (){
        System.out.println("car started with key...");
    }
    @Override
    public void stop () {
        System.out.println("Car stoped");
    }
    @Override
    public double calculateFare (int distance){
        return distance * ratePerKm ;
    }
}

class Bike implements Vehicle {
    double ratePerKm = 10.0;
    @Override
    public void start(){
        System.out.println("Bike started with kick...");
    }
    @Override
    public void stop(){
        System.out.println("Bike stopped");
    }
    @Override
    public double calculateFare (int distance){
        return distance * ratePerKm ;
    }
}

public class Q35 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        System.out.println("Car Fare for 10 km: Rs." + car.calculateFare(10));
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        System.out.println("Bike Fare for 10 km: Rs." + bike.calculateFare(10));
        bike.stop();
    }
}
