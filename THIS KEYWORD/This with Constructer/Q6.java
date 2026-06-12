// 6.Write a Java program to use this keyword in constructor to initialize variables.


class Person{
    int age;
    String name;

    public Person(int age , String name) {
        this.age= age;
        this.name= name;
    }

    void show(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
    
}

public class Q6 {
    public static void main(String[] args) {
        Person P = new Person(21, "Anish gupta");
        P.show();
    }
}
