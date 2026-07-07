// 22.Pass values from a child constructor to a parent constructor using super(parameter).

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name of Super : " + name);
        System.out.println("Age of Super : " + age);
    }

}

class Student extends Person {
    int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age); // pass values to parent constructor
        this.rollNo = rollNo;
    }

    @Override
    void show() {
        super.show(); // call parent show()
        System.out.println("Roll No: " + rollNo);
    }
}

public class Q22 {

    public static void main(String[] args) {
        Person p = new Student("Anish", 21, 29);
        p.show();
    }
}
