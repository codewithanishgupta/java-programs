//10.Write a Java program to create an abstract class Machine with an abstract method operate().

abstract class Machine {
    String name;

    public Machine(String name) {
        this.name = name;
    }
    
    abstract void operate();

    void display(){
        System.out.println("MAchine Name : "+name);
        System.out.print(name + " is operating : ");
        operate();
    }
}

class Printer extends Machine {

    public Printer() {
        super("Printer");
    }
    void operate(){
        System.out.println("Printing Document......");
    }
}

class Computer extends Machine{

    public Computer() {
        super("Computer");
    }
    @Override
    void operate(){
        System.out.println("Running Prohrams......");
    }
    
}
public class Q10 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.display();

        System.out.println("__________________________________");

        Computer c = new Computer();
        c.display();

    }
}
