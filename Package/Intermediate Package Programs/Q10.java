// 10.Create a package vehicle containing classes: Car, Bike -> Create objects of both classes from another package.

import vehicle.Bike;
import vehicle.Car;

public class Q10 {
    public static void main(String[] args) {
        Car c = new Car("Swift", "Maruti Suzuki", 600000);
        Bike b = new Bike("Pulsar", "Bajaj", 95000);

        c.showCar();
        b.showBike();
    }
}

