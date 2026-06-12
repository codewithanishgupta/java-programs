// 27.Write a Java program to compare behavior with and without super keyword.


class Parent{
    int x=30;
    String name="codewithanishgupta";
    public Parent() {
        System.out.println("Parent constructer call...");
    }
    
}

class Child extends Parent{

    int x=20;
    String name= "Anish gupta";

    public Child() {
        //super();   is atomatically call
    }

        
    void display(){
        System.out.println("Without Super keyword ");
        System.out.println("X : "+x);
        System.out.println("Name : "+name);
        System.out.println("With super keyword use.");
        System.out.println("X : "+super.x);
        System.out.println("Name : "+super.name);
    }

}

public class BehaviorOfSuper {
    public static void main(String[] args) {
    Child C=new Child();
    C.display();
    }
}
