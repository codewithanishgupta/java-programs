// 38.Write a Java program to create an abstract class with both abstract and non-abstract methods.

abstract class Phone {
    String name;
    String model;
    double price;
    abstract void call();
    abstract void ring ();
    abstract void charge ();
    abstract void switchOn ();
    abstract void switchOff ();

    public Phone(String name , String model , double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    void show(){
        System.out.println("Phone Name : "+name);
        System.out.println("Model : "+model);
        call();
        ring();
        charge();
        switchOn();
        switchOff();
        System.out.println("Price Rs. : "+price);
        System.out.println("---------------------------------------------------");
    }
}

class Redmi extends Phone {

    public Redmi(String name , String model , double price) {
        super(name, model, price);
    }
    @Override
    void call (){
        System.out.println("Added calling functions..");
    }
    @Override
    void ring () {
        System.out.println("Add Ring function..");
    }
    @Override
    void charge () {
        System.out.println("Added charging functions..");
    }
    @Override
    void switchOn (){
        System.out.println("Switch On Button");
    }
    @Override
    void switchOff (){
        System.out.println("Switch Off Button");
    }
}

class Sumsung extends Phone {
    public Sumsung (String name , String model , double price) {
        super(name, model, price);
    }
    @Override
    void call (){
        System.out.println("Added calling functions..");
    }
    @Override
    void ring () {
        System.out.println("Add Ring function..");
    }
    @Override
    void charge () {
        System.out.println("Added charging functions..");
    }
    @Override
    void switchOn (){
        System.out.println("Switch On Button");
    }
    @Override
    void switchOff (){
        System.out.println("Switch Off Button");
    }
}

public class Q38 {
    public static void main(String[] args) {
        Phone sum =new Sumsung("Sumsung S20", "HT8674", 159999);
        sum.show();

        Phone red = new Redmi("Redmi 13 5g", "PTRDN98", 1599);
        red.show();
    }
}
