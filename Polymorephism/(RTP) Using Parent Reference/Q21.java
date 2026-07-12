// 21.Write a Java program demonstrating runtime polymorphism using: Animal a; Assign objects of Dog, Cat, and Cow to it.

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

public class Q21 {
    public static void main(String[] args) {
        // Runtime polymorphism
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}