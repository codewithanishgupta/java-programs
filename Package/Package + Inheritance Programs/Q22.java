// 22.Create a package vehicle and inherit Car from Vehicle in another package.


import car.Car;

public class Q22 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 180, "Corolla", 5);
        c1.displayCar();
    }
}
