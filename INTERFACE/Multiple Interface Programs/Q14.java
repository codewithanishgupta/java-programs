// 14.Create interfaces Flyable and Swimmable. Implement both in a class Duck. 

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable , Swimmable {
    String name ;

    public Duck(String name) {
        this.name = name ;
    }
    @Override
    public void fly(){
        System.out.println(name + " is flying gracefully in the sky... ");
    }
    @Override
    public void swim () {
        System.out.println(name + " is Swimming smoothly in the pond");
    }
    
}

public class Q14 {
    public static void main(String[] args) {
        Duck d = new Duck("Anish");
        d.fly();
        d.swim();
    }
}
