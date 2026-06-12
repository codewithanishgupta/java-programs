

class GrandParent{

    public GrandParent() {
    System.out.println("Dada jii ko call kiya gya.");
    }

}


class Parent extends GrandParent{

    public Parent() {
        // super(); by default
        System.out.println("Papa jii ko call kiya gya. ");
    }
    
}

class Child extends Parent{

    public Child() {
        // super(); by default 
        System.out.println("Bachaba ko call kiya gya.");
    }
    
}

public class TwolevelInheritance {
    public static void main(String[] args) {
        Child obj=new Child();
    }
}
