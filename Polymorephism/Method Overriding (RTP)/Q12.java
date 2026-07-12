// 12.Create a class Vehicle with method run(). Override it in:,Car ,Bike ,Bus 

class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly on the road...");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running fast on the highway...");
    }
}

class Bus extends Vehicle {
    @Override
    void run() {
        System.out.println("Bus is running with many passengers...");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.run();

        v = new Bike();
        v.run();

        v = new Bus();
        v.run();
    }
}
