// 23.Write a Java program to implement an interface in multiple classes. 

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

public class Q23 {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  
        a.sound();

        a = new Cat(); 
        a.sound();

        a = new Cow();
        a.sound();
    }
}
