// 26.Write a Java program to demonstrate use of super with variables, methods, 
//      and constructors in one program.


class Parent{
    int x;
    String name;

    public Parent() {
        System.out.println("Parent constructer.");
        }

        void display(){
            System.out.println("X : "+x);
            System.out.println("Name : "+name);
        }
    

}

class Child extends Parent {

    public Child(int x, String name) {
        super();  // super constructer.

        super.x=x;
        super.name= name;  // super variable 

        super.display();    // super method/
    }
        
}

public class DemonstrateSuper {
    public static void main(String[] args) {
        Child Ch= new Child(29, "Anish Gupta"); 
    }
    
}
