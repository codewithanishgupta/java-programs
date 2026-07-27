package animal;

public class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Animal Type: " + type);
    }

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

