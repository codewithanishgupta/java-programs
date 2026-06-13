// 4.Write a Java program to create an abstract class Person with an abstract method display() and implement it in Student.


abstract class Person{
    String name;
    int hight;
    String color;

    public Person() {}
     
    abstract void display();
}

class Student extends Person {
    int id;
    public Student(String name , int id ) {
        super.name = name;
        this.id = id;
    }
    @Override
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
    
}

public class Q4 {
    public static void main(String[] args) {
        Student s = new Student("Anish Gupta ", 29);
        s.display();
    }
}
