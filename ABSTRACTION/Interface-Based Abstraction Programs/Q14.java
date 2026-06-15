// 14.Write a Java program to create an interface Vehicle and implement it in Bike and Car.

interface Vehicle{
    void start();
    void stop();
}

class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike started with kick..");
    }
    @Override
    public void stop(){
        System.out.println("Bike stoped...");
    }
}

class Car implements Vehicle {
    public void start(){
        System.out.println("Car started with key ignition");
    }
    public void stop(){
        System.out.println("Car stoped..");
    }
}
public class Q14 {
    public static void main(String[] args) {
        Vehicle B = new Bike();
        Vehicle C = new Car();

        B.start();
        B.start();

        C.start();
        C.stop();
    }
}
