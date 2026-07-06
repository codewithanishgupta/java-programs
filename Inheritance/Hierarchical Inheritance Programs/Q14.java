// 14. Create a base class Vehicle and derive:Bike,Car,Bus Display their specifications.

class Vehicle {
    String brand;
    int speed;

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Bike extends Vehicle {
    int mileage;

    void displayBike() {
        displayVehicle();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class Car extends Vehicle {
    int seats;

    void displayCar() {
        displayVehicle();
        System.out.println("Seats: " + seats);
    }
}

class Bus extends Vehicle {
    int capacity;

    void displayBus() {
        displayVehicle();
        System.out.println("Passenger Capacity: " + capacity);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.brand = "Yamaha";
        b.speed = 120;
        b.mileage = 40;
        b.displayBike();

        System.out.println();

        Car c = new Car();
        c.brand = "Honda";
        c.speed = 180;
        c.seats = 5;
        c.displayCar();

        System.out.println();

        Bus bus = new Bus();
        bus.brand = "Volvo";
        bus.speed = 100;
        bus.capacity = 50;
        bus.displayBus();
    }
}
