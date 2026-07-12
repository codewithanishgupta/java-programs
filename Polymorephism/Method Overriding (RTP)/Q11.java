// 11.Create a class Animal with method sound(). Override it in: Dog ,Cat,Cow 

class Animal {
    void sound() {
        System.out.println("Animal sound ");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog say: bow bow bow...");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat say: meow meow meow...");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow say: moo moo moo...");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Animal A;
        A = new Dog();
        A.sound();

        A = new Cat();
        A.sound();

        A = new Cow();
        A.sound();
    }
}