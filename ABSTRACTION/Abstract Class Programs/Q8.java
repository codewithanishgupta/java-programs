// 8.Write a Java program to create an abstract class Fruit with an abstract method taste().

abstract  class Fruit {
    String name;

    public Fruit(String name ) {
        this.name = name;
    }
    
    abstract  void taste();
    void display(){
        System.out.print(name+" is ");
        taste();
    }
}

class Mango extends Fruit {

    public Mango() {
        super("Mango");
    }
    
    void taste(){
        System.out.println("Sweet...");
    }
}

class Grapes extends Fruit{

    public Grapes() {
        super("Grapes");
    }
    void taste(){
        System.out.println("Sour");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Mango mg = new Mango();
        mg.display();

        Grapes gr = new Grapes();
        gr.display();
    }
}
