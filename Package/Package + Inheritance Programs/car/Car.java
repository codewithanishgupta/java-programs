package car;

import car.vehicle.Vehicle;

public class Car extends Vehicle {
    private String model;
    private int seats;

    public Car(String brand, int speed, String model, int seats) {
        super(brand, speed);
        this.model = model;
        this.seats = seats;
    }

    public void displayCar() {
        super.display();
        System.out.println("Model: " + model);
        System.out.println("Seats: " + seats);
    }
}