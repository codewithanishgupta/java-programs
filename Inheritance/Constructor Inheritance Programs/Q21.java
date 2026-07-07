// 21.Create a parent class constructor and call it from a child class using super().

class Parent {

    public Parent() {
        System.out.println("This is Parent class constructor...");
    }
    
}

class Child extends Parent {

    public Child() {
        super(); // this is default
        System.out.println("This is Child class constructor...");
    }
    
}

public class Q21 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}