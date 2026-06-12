// 9.Write a Java program to show execution order of constructors using super.

class Parent{

    public Parent() {
        System.out.println("Parent constructer call.....");
    }

}


class Child extends Parent{

    public Child() {
        // by default super() call wen child constructer is call
        System.out.println("Child constructer is call...");
    }
    
}

public class ExecutionOrder {
    public static void main(String[] args) {
        Child Ch=new Child();
    }
}
