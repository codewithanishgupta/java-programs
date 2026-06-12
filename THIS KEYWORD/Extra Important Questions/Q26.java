// 26.Write a Java program to demonstrate all uses of this keyword in one program.

class Demo {
    int id;
    String name;

    // 1. Using 'this' to resolve ambiguity
    Demo(int id, String name) {
        this.id = id;      
        this.name = name;
    }

    // 2. Using 'this' to call current class method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    void show() {
        this.display();     // calling current class method
    }

    // 3. Constructor chaining using 'this'
    Demo() {
        this(0, "Unknown"); // calls parameterized constructor
    }

    // 4. Passing current object as argument
    void print(Demo obj) {
        System.out.println("Printing from print(): " + obj.name);
    }

    void callPrint() {
        this.print(this);   // passing current object
    }

    // 5. Returning current object
    Demo getObject() {
        return this;
    }

    // 6. Method chaining using 'this'
    Demo setId(int id) {
        this.id = id;
        return this;
    }

    Demo setName(String name) {
        this.name = name;
        return this;
    }
}

public class Q26{
    public static void main(String[] args) {
        // Constructor chaining
        Demo d1 = new Demo();
        d1.show();

        // Passing current object
        d1.callPrint();

        // Returning current object + method chaining
        Demo d2 = new Demo().setId(101).setName("Anish");
        d2.display();

        // Using getObject()
        Demo d3 = new Demo(202, "Copilot");
        Demo ref = d3.getObject();
        ref.display();
    }
}

