// 17.Write a Java program to demonstrate that super() must be first statement in constructor.


class Parent{

    public Parent() {
        System.out.println("Parent constructer calling.......");
    }
    
}
class Child extends Parent{

    public Child() {
        // by default firt super() constructer is call in child constructer.
        System.out.println(" First statment in chid constructer..");


        //super(); aaise bich me call krne pe error dega.

        System.out.println("Last statment Child constructer calling......");

    }
    
}

public class DemonstrantSuper {
    public static void main(String[] args) {
        Child obj= new Child();
    }
    
}
