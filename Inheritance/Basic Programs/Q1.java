// 1.Create a class Animal with a method eat(). Inherit it in a class Dog and add a method bark().

class Animal {
    void eat () {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal {

    void bark(){
        System.out.println("Dogs are barking..");
    }

}
public class Q1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}