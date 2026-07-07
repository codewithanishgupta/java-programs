// 16.Create a class Animal with method sound(). Override it in Dog and Cat.

class Animal {
    void sound() {
        System.out.println("Animal make a sound ");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says : Bhow Bhow Bhow............");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says : meow meow meow............");
    }
}

public class Q16 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();

        Animal c = new Cat();
        c.sound();
    }
}