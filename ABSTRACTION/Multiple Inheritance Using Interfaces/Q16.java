// 16.Write a Java program to demonstrate multiple inheritance using interfaces.

interface Engine {
    void startEngine();
    void name();
}

interface Wheels {
    void rotatedWheels();
    void name();
}

class Car implements Engine , Wheels {
    @Override
    public void startEngine(){
        System.out.println("Car engine started.....");
    }
    @Override
    public void rotatedWheels(){
        System.out.println("Car wheels are rotating...");
    }
    @Override
    public void name(){
        System.out.println("Maruti");
    }
}

public class Q16{
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.rotatedWheels();
        c.name();
    }
}