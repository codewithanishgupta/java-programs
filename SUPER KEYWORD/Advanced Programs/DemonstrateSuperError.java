// 20.Write a Java program to demonstrate error when super is not used properly.

class Parent{
    String name ="codewithanishgupta";

    public Parent() {
        System.out.println("Parent constructer.........");
    }
    
}

class Child extends Parent{
    // super();             super() not call outside constructer
    void show(){

        // super();         super constructer not access any method its only in access child constructer.       
    }

    public Child() {
        System.out.println("1st element ");

        // super();  super not call between the elements .its first call when constructer call.

        System.out.println("Second element.");

    }

    
}


public class DemonstrateSuperError {
    public static void main(String[] args) {
        Child obj= new Child();
    }
}
