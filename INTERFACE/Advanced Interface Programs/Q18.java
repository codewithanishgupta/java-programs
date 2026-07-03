// Create an interface with a static method and call it.

interface Person {
    static void speak (){
        System.out.println("It con speak \n and this is static method inside the interface");
    }
}

class Demo implements Person {
    String name;

    public Demo(String name) {
        this.name = name;
    }
    void display(){
        // speak();  con not access
        System.out.println("Name : "+name);
        Person.speak();
    }
    
}

public class Q18 {
    public static void main(String[] args) {
        Demo d = new Demo("Anish");
        d.display();
        System.out.println();
        Person.speak();   // static method ko interface ke name se acces kr skte hai
    }
}
