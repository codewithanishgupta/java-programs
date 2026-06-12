// 7.Write a Java program to call one constructor from another using this().


class Car{
    int price;
    String modal;

    public Car(int price , String modal) {
        this.price=price;
        this.modal=modal;
        System.out.println("Parameterise constructer call.");
        System.out.println("Car Price : "+this.price);
        System.out.println("Car Modal : "+this.modal);
        
    }

    public Car() {
        this(2899, "F2MG:L2026");
    }

    
    
}

public class Q7 {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
