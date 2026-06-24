// 37.Write a Java program to demonstrate abstraction using an interface.

interface Person {
    void speak () ;
    void eat ();
    void run();
}

abstract class Human implements Person {
    String name ;
    int age;

    public Human(String name , int age) {
        this.name= name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.print("Eating : ");
        eat();
        System.out.print("Speak : ");
        speak();
        System.out.print("Run : ");
        run();
        System.out.println("---------------------------------------------");
    }  
}

class Student extends Human {

    public Student(String name , int age) {
        super(name, age);
    }
    @Override
    public void speak (){
        System.out.println("Speaking..");
    }
    @Override
    public void eat () {
        System.out.println("Normal food");
    }
    @Override
    public void run(){
        System.out.println("Running fast");
    }
}

class Teacher extends Human {

    public Teacher (String name , int age) {
        super(name, age);
    }
    @Override
    public void speak (){
        System.out.println("Vocalization");
    }
    @Override
    public void eat () {
        System.out.println("Normal food");
    }
    @Override
    public void run(){
        System.out.println("Running fast");
    }
}

public class Q37 {
    public static void main(String[] args) {
        Human st = new Student("Anish", 21);
        st.display();

        Human t = new Teacher("Lado", 22);
        t.display();
    }
}
