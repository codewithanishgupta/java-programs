// 7.Write a Java program to create an abstract class Appliance with an abstract method turnOn().

abstract class Appliance {
    String name;

    public Appliance(String name) {
        this.name = name;
    }
    
    abstract void turnOn();
    void display(){
        System.out.print(name + " :");
        turnOn();
    }
}

class Fridge extends Appliance{

    public Fridge() {
        super("Fridge");
    }
    void turnOn(){
        System.out.println(" TurnOn");
    }
}

class WashingMachine extends Appliance{

    public WashingMachine() {
        super("Washing Machine");
    }
    void turnOn(){
        System.out.println(" TurnOn");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Fridge f = new Fridge();
        f.display();

        WashingMachine wh = new WashingMachine();
        wh.display();

    }
}
