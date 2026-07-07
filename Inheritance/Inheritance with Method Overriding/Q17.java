// 17.Create a class Vehicle with method run(). Override it in Bike and Car.

class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running at 60 km/h...");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running at 120 km/h...");
    }
}

public class Q17 {
    public static void main(String[] args) {
        Vehicle v; // base class reference

        v = new Bike();
        v.run();

        v = new Car();
        v.run();
    }
}
