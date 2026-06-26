// 3.Create an interface Vehicle with methods start() and stop(). Implement it in classes Car and Bike. 

interface Vehicle {
    void start();
    void stop();
}

class Car implements  Vehicle {
    @Override
    public void start () {
        System.out.println("Car Start with key on");
    }
    @Override
    public void stop () {
        System.out.println("Car Stop with key off");
    }
}

class Bike implements Vehicle {
    @Override
    public void start () {
        System.out.println("Bike Start with Kick");
    }
    @Override
    public void stop () {
        System.out.println("Bike Stop with key off");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle [] vehicles = {new Car() , new Bike()};
        for(Vehicle v : vehicles){
            System.out.println(v.getClass().getSimpleName()+"->");
            v.start();
            v.stop();
        }
    }
}
