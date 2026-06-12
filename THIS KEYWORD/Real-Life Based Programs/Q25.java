// 25.Write a Java program to create class Car using this to set and display details.\

class Car{
    String name;
    String model;
    int price;

    void set(String name, String model , int price){
        this.name=name;
        this.model=model;
        this.price=price;
    }

    void display(){
        System.out.println("----------------Car Details------------");
        System.out.println("Name : "+name);
        System.out.println("Model : "+model);
        System.out.println("Price  : "+price);
    }
}

public class Q25 {
    public static void main(String[] args) {
        Car c= new Car();
        c.set("Maruti", "X5CR7P2016", 399999);
        c.display();
    }
}
