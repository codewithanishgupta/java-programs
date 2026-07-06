// 11. Create a base class Animal and derive:Dog ,Cat, Cow Each should have its own sound method.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow says: Moo Moo!");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();

        d.sound();
        c.sound();
        cw.sound();
    }
}
