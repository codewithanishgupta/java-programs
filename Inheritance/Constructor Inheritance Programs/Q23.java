// 23.Create a multilevel inheritance program using constructors.

class GrandParent {
    public GrandParent() {
        System.out.println("GrandParent constructor called...");
    }
}

class Parent extends GrandParent {
    public Parent() {
        super();
        System.out.println("Parent constructor called...");
    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child constructor called...");
    }
}

public class Q23 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
