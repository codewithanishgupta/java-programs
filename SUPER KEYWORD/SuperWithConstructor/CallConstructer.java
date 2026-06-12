// 6.Write a Java program to call parent class constructor using super().


class Parent{

    public Parent() {
        System.out.println("Parent constructer call.....");
    }
    
}

class Child extends Parent{

    public Child() {
        super();
        System.out.println("Child constructor call.....");
    }
    
}

public class CallConstructer {
    public static void main(String[] args) {
        Child C= new Child();
    }
}
