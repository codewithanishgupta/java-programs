// 28.Write a Java program to create an abstract class Transport and calculate fare for Bus, Train, and Taxi.

abstract class Transport {
    String type;

    public Transport(String type) {
        this.type=type;
    }
    
    abstract double calculateFare (int distance);

    void display(int distance){
        System.out.println(type + " fare for " + distance + " km is: " + calculateFare(distance));
        System.out.println("-----------------------------------");
    }
}

class Bus extends Transport {
    double ratePerKm=10.0;

    public Bus() {
        super("BUS");
    }
    @Override
    double calculateFare (int distance){
        return ratePerKm*distance;
    }
}

class Train extends Transport {
    double ratePerKm=5.0;

    public Train() {
        super("TRAIN");
    }
    @Override
    double calculateFare (int distance ){
        return ratePerKm*distance;
    }
}

class Taxi extends Transport {
    double busFare=50.0;
    double ratePerKm=20.0;

    public Taxi() {
        super("TAXI");
    }
    @Override
    double calculateFare (int distance){
        return busFare + (ratePerKm*distance);
    }
}

public class Q28 {
    public static void main(String[] args) {
         Transport bus = new Bus();
        Transport train = new Train();
        Transport taxi = new Taxi();

        bus.display(10);   
        train.display(15); 
        taxi.display(8);  
    }
}
