package dog;

import animal.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        super("Dog"); 
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void displayDog() {
        super.display();
        System.out.println("Breed: " + breed);
        sound();
    }
}
