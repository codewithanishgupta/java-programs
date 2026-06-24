// 36.Write a Java program to demonstrate abstraction using an abstract class.

abstract class Animal {
    String name;
    abstract void eat();
    abstract void sound ();

    public Animal(String name) {
        this.name=name;
    }
    
    void detsilsOfAnimal(){
        System.out.println("Name is : "+name);
        System.out.print("Eating : ");
        eat();
        System.out.print("Sound : ");
        sound();
        System.out.println("---------------------------------------------");
    }
}

class Cow extends Animal {
    String name ;

    public Cow(String name ) {
        super(name);
    }
    @Override
    void eat (){
        System.out.println("Grass");
    }
    @Override
    void sound () {
        System.out.println("moo moo moo.......");
    }
}

class Dog extends Animal {
    String name ;

    public Dog(String name) {
        super(name);
    }
    @Override
    void eat (){
        System.out.println("Normal food");
    }
    @Override
    void sound (){
        System.out.println("Barking");
    }
}


public class Q36 {
    public static void main(String[] args) {
        Animal C = new Cow("Cow");
        C.detsilsOfAnimal();
        Animal D = new Dog("Dog");
        D.detsilsOfAnimal();
    }
}