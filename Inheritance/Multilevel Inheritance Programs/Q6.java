// 6. Create classes: Animal,Dog,Puppy Demonstrate inheritance through all three classes.

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
