// 25.Write a Java program demonstrating dynamic method dispatch.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Bow Bow...");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow...");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow says: Moo Moo...");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        // Parent reference
        Animal a;

        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}