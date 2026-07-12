// 16.Create a class Bird with method fly(). Override it in:Sparrow,Eagle,Penguin 

class Bird {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies at low height...");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flies high in the sky...");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguin cannot fly, it swims instead...");
    }
}

public class Q16 {
    public static void main(String[] args) {
        Bird b;

        b = new Sparrow();
        b.fly();

        b = new Eagle();
        b.fly();

        b = new Penguin();
        b.fly();
    }
}
