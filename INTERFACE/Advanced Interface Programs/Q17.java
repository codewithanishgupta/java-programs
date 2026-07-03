// 17.Create an interface with a default method and implement it. 

interface Greeting {
    void sayHello(String name);

    default void defaultMessage () {
        System.out.println("this is default greeting message ");
    }
}

class Person implements Greeting {
    String personName;

    public Person(String persoNnName){
        this.personName =  persoNnName;
    }    
    @Override
    public void sayHello (String name) {
        System.out.println(personName + " says : hello "+name);
    }    
}

public class Q17 {
    public static void main(String[] args) {
        Person p = new Person("Anish");
        p.sayHello("Lado");

        p.defaultMessage();
    }
}
