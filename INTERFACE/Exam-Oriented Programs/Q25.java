// 25.Write a Java program to compare abstract classes and interfaces using examples. 


abstract class Animal {
    abstract void sound();   
    void sleep() {           
        System.out.println("Animal is sleeping...");
    }
}

interface Vehicle {
    void start();          
    default void stop() { 
        System.out.println("Vehicle is stopping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with ignition...");
    }
}

public class Q25 {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
        a.sleep();

        System.out.println();


        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}

