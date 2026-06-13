// 1.Write a Java program to create an abstract class Animal with an abstract method sound() and implement it in a subclass Dog.

abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bhoww Bhoww Bhow..");
    }
}

public class Q1{
    public static void main(String[] args) {
        Dog dg= new Dog();
        dg.sound();
    }
}