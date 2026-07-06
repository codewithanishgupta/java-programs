// 3. Create a class Vehicle with properties brand and speed. Derive a class Car and display all details.

class Vehicle {
    String brand;
    int speed;

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int seats;

    void displayCar() {
        displayVehicle();
        System.out.println("Seats: " + seats);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Tesla";
        c.speed = 200;
        c.seats = 5;

        c.displayCar();
    }
}
