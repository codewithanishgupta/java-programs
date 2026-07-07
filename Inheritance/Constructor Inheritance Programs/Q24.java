// 24.Display constructor execution order in inheritance.

class GrandParent {
    public GrandParent(String familyName) {
        System.out.println("GrandParent constructor: Family = " + familyName);
    }
}

class Parent extends GrandParent {
    public Parent(String familyName, int age) {
        super(familyName);
        System.out.println("Parent constructor: Age = " + age);
    }
}

class Child extends Parent {
    public Child(String familyName, int age, String name) {
        super(familyName, age);
        System.out.println("Child constructor: Name = " + name);
    }
}

public class Q24 {
    public static void main(String[] args) {
        Child c = new Child("Gupta", 29, "Anish");
    }
}
