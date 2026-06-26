// 1.Create an interface Animal with a method sound(). Implement it in classes Dog and Cat. 

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound (){
        System.out.println("DOG Sound : Bhoww Bhow Bhow.........");
    }
}

class Cat implements  Animal {
    @Override
    public void sound () {
        System.out.println("CAT Sound : meoww meow meow......");
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Animal dg = new Dog();
        // dg.sound();
        // Animal c = new Cat();
        // c.sound();

        Animal [] animals = { new Dog() , new Cat() };
        for (Animal a : animals){
            a.sound();
        }
    }
}