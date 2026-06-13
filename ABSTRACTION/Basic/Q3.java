// 3.Write a Java program to create an abstract class Vehicle with an abstract method start() and implement it in Car.

abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    @Override 
    void start(){
        System.out.println("Car started......");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();
    }
}
